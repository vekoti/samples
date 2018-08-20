package test.mongodb.etl;

import java.sql.SQLException;

import test.mongodb.etl.impl.MongoDataLoader;
import test.mongodb.etl.sql.DocumentProducer;

public class Main {

	public static void main(String[] args) throws SQLException {
		MongoDataLoader.newInstance().setProducer(new DocumentProducer()).setConsumer(new MongoConsumer()).load();
	}

}
