package test.mongodb.etl.converter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;

public class BigDecimalStringCodec implements Codec<BigDecimal> {

	private final static char[] SIGNS = { '-', '+', '+' };

	private final Integer zeroPadding;

	private final Integer scale;

	public BigDecimalStringCodec() {
		this(null, null);
	}

	public BigDecimalStringCodec(Integer zeroPadding) {
		this(zeroPadding, null);
	}

	public BigDecimalStringCodec(Integer zeroPadding, Integer scale) {
		this.zeroPadding = zeroPadding;
		this.scale = scale;
	}

	@Override
	public Class<BigDecimal> getEncoderClass() {
		return BigDecimal.class;
	}

	@Override
	public void encode(BsonWriter writer, BigDecimal value, EncoderContext encoderContext) {
		if (this.zeroPadding == null) {
			writer.writeString(value.toString());
		} else {
			writer.writeString(formatBigDecimal(value));
		}
	}

	@Override
	public BigDecimal decode(BsonReader reader, DecoderContext decoderContext) {
		if (this.scale == null) {
			return new BigDecimal(reader.readString());
		}
		return new BigDecimal(new BigInteger(reader.readString()), this.scale);
	}

	private String formatBigDecimal(BigDecimal bd) {
		char[] result = new char[this.zeroPadding];
		Arrays.fill(result, '0');
		result[0] = SIGNS[bd.signum() + 1];

		String s;
		if (this.scale == null) {
			s = bd.toString();
		} else {
			s = bd.unscaledValue().toString();
		}

		if (s.startsWith("-")) {
			s = s.substring(1);
		}

		char[] source = s.toCharArray();
		System.arraycopy(source, 0, result, result.length - source.length, source.length);

		return new String(result);
	}

}