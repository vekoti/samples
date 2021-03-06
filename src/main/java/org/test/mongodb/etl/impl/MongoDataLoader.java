package org.test.mongodb.etl.impl;


import org.test.mongodb.etl.Consumer;
import org.test.mongodb.etl.DataLoader;
import org.test.mongodb.etl.Document;
import org.test.mongodb.etl.DocumentQueue;
import org.test.mongodb.etl.Producer;

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
