package com.cisco.ccw.quote.etl;

/**
 * 
 * @author vekoti
 *
 */
public interface Consumer<T> {

	void consume(DocumentQueue<T> queue);
}
