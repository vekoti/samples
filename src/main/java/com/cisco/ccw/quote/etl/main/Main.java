package com.cisco.ccw.quote.etl.main;

import java.sql.SQLException;

import com.cisco.ccw.quote.etl.impl.MongoDataLoader;
import com.cisco.ccw.quote.etl.mongodb.MongoConsumer;
import com.cisco.ccw.quote.etl.sql.DocumentProducer;

public class Main {

	public static void main(String[] args) throws SQLException {
		MongoDataLoader.newInstance().setProducer(new DocumentProducer()).setConsumer(new MongoConsumer()).load();
	}

}
