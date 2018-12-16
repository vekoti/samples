package org.test.mongodb.etl.sql;

import java.sql.Connection;
import java.sql.SQLException;

import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.service.UnknownUnwrapTypeException;
import org.test.mongodb.etl.ApplicationContext;

@SuppressWarnings({ "rawtypes", "unchecked" })
public final class ConnectionProviderImpl implements ConnectionProvider {

	private static final long serialVersionUID = 4805933459347902346L;

	@Override
	public boolean isUnwrappableAs(Class unwrapType) {
		return ConnectionProvider.class.equals(unwrapType) || ConnectionProviderImpl.class.isAssignableFrom(unwrapType);
	}

	@Override
	public <T> T unwrap(Class<T> unwrapType) {
		if (ConnectionProvider.class.equals(unwrapType) || ConnectionProviderImpl.class.isAssignableFrom(unwrapType)) {
			return (T) this;
		} else {
			throw new UnknownUnwrapTypeException(unwrapType);
		}
	}

	@Override
	public void closeConnection(Connection connection) throws SQLException {
		if (connection != null) {
			connection.close();
		}
	}

	@Override
	public Connection getConnection() throws SQLException {
		return ApplicationContext.getInstance().getConnection();
	}

	@Override
	public boolean supportsAggressiveRelease() {
		return false;
	}

}
