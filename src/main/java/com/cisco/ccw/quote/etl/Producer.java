package com.cisco.ccw.quote.etl;

/**
 * 
 * @author vekoti
 *
 */
public interface Producer<T> {

	void produce(DocumentQueue<T> queue);
}
