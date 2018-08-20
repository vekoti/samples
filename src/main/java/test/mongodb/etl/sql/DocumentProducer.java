package test.mongodb.etl.sql;

import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

import test.mongodb.etl.Document;
import test.mongodb.etl.DocumentQueue;
import test.mongodb.etl.Producer;
import test.mongodb.etl.annotation.AnnotationUtils;

/**
 * 
 * @author vekoti
 *
 */
public class DocumentProducer implements Producer<Document>, Runnable {

	int threadLimit = 5;

	private DocumentQueue<Document> documentQueue;

	@Override
	public void produce(DocumentQueue<Document> queue) {
		documentQueue = queue;
		Thread thread = new Thread(this);
		thread.start();
	}

	private Queue<Class<?>> findAnnotatedClasses() {
		Set<Class<?>> annotated = AnnotationUtils.getClassesByAnnotation("com.cisco.ccw.quote.etl.sql.model", test.mongodb.etl.annotation.Document.class);
		Queue<Class<?>> queue = new ConcurrentLinkedQueue<Class<?>>();
		queue.addAll(annotated);
		return queue;
	}

	@Override
	public void run() {
		Queue<Class<?>> typeQueue = findAnnotatedClasses();
		for (int i = 0; i < threadLimit; i++) {
			ProducerThread producerThread = new ProducerThread(typeQueue, documentQueue);
			producerThread.start();
		}
	}
}
