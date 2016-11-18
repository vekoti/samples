package com.cisco.ccw.quote.etl.impl;

import com.cisco.ccw.quote.etl.Consumer;
import com.cisco.ccw.quote.etl.DataLoader;
import com.cisco.ccw.quote.etl.DocumentQueue;
import com.cisco.ccw.quote.etl.Producer;
import com.cisco.ccw.quote.etl.sql.model.Document;

public class MongoDataLoader implements DataLoader {

	private Producer<Document> producer;

	private Consumer<Document> consumer;

	@Override
	public void load() {
		if (producer != null && consumer != null) {
			DocumentQueue<Document> queue = new DocumentQueue<Document>(500);
			producer.produce(queue);
			consumer.consume(queue);
		}
	}

	public static MongoDataLoader newInstance() {
		return new MongoDataLoader();
	}

	public MongoDataLoader setProducer(Producer<Document> producer) {
		this.producer = producer;
		return this;
	}

	public MongoDataLoader setConsumer(Consumer<Document> consumer) {
		this.consumer = consumer;
		return this;
	}

}
