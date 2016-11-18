package com.cisco.ccw.quote.etl.mongodb;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.cisco.ccw.quote.etl.Consumer;
import com.cisco.ccw.quote.etl.DocumentQueue;
import com.cisco.ccw.quote.etl.sql.model.Document;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

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
