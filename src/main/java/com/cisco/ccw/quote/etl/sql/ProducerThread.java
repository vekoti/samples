package com.cisco.ccw.quote.etl.sql;

import java.util.Queue;
import java.util.stream.Stream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.cisco.ccw.quote.etl.ApplicationContext;
import com.cisco.ccw.quote.etl.DocumentQueue;
import com.cisco.ccw.quote.etl.sql.model.Document;
import com.cisco.ccw.quote.etl.sql.model.DocumentMetaData;

public class ProducerThread extends Thread {

	private static final Logger LOG = LogManager.getLogger();

	private Queue<Class<?>> typeQueue;

	private DocumentQueue<Document> documentQueue;

	public ProducerThread(Queue<Class<?>> typeQueue, DocumentQueue<Document> documentQueue) {
		this.typeQueue = typeQueue;
		this.documentQueue = documentQueue;
	}

	public void run() {
		Class<?> type = null;
		while ((type = typeQueue.poll()) != null) {
			loadData(type);
		}
	}

	private void loadData(Class<?> type) {
		try {
			Session session = ApplicationContext.getInstance().createSession();
			com.cisco.ccw.quote.etl.annotation.Document document = type.getDeclaredAnnotation(com.cisco.ccw.quote.etl.annotation.Document.class);
			String query = document.query();
			if (query != null && query.trim().length() > 0) {
				Query<Document> typeQuery = session.createQuery(query, Document.class);
				typeQuery.setMaxResults(100);
				typeQuery.setReadOnly(true);

				DocumentMetaData metaData = new DocumentMetaData();
				metaData.setName(document.name());

				Stream<Document> stream = typeQuery.stream();
				stream.forEach(doc -> {
					doc.setMetaData(metaData);
					documentQueue.offer(doc);
				});
			}
			
			session.close();
		} catch (Exception exception) {
			LOG.error(exception, exception);
		}
	}
}
