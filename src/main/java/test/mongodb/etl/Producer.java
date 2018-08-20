package test.mongodb.etl;

/**
 * 
 * @author vekoti
 *
 */
public interface Producer<T> {

	void produce(DocumentQueue<T> queue);
}
