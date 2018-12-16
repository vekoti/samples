package org.test.mongodb.etl;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 
 * @author vekoti
 *
 */
public class DocumentQueue<T> extends ArrayBlockingQueue<T> {

	private static final long serialVersionUID = 5988033143759361942L;

	public DocumentQueue(int capacity) {
		super(capacity);
	}

}
