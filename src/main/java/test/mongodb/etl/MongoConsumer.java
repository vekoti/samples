package test.mongodb.etl;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

import test.mongodb.etl.converter.BigDecimalConverter;

/**
 * 
 * @author vekoti
 *
 */
public class MongoConsumer implements Consumer<Document> {

	public MongoConsumer() {

	}

	@Override
	public void consume(DocumentQueue<Document> queue) {
		ServerAddress address = new ServerAddress("", 27017);

		MongoClient mongoClient = new MongoClient(address);

		Morphia morphia = new Morphia();
		morphia.setUseBulkWriteOperations(true);
		morphia.mapPackage("com.cisco.ccw.quote.etl.sql.model");
		morphia.getMapper().getConverters().addConverter(BigDecimalConverter.class);
		Datastore datastore = morphia.createDatastore(mongoClient, "mongodm");
		datastore.ensureIndexes();

		new Thread(() -> {
			try {
				Document document = null;
				while ((document = queue.take()) != null) {
					datastore.save(document);
				}
			} catch (InterruptedException exception) {

			}
		}).start();
	}

}
