package test.mongodb.etl;

/**
 * 
 * @author vekoti
 *
 */
public interface Consumer<T> {

	void consume(DocumentQueue<T> queue);
}
