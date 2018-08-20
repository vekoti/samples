package test.mongodb.etl;

import java.io.File;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.tomcat.jdbc.pool.DataSourceFactory;
import org.hibernate.Session;

import test.mongodb.etl.config.Config;
import test.mongodb.etl.config.Property;

/**
 * 
 * @author vekoti
 *
 */
public class ApplicationContext {

	private static final Logger LOG = LogManager.getLogger();

	private static final ApplicationContext INSTANCE = new ApplicationContext();

	private Config config;

	private DataSource dataSource;

	private EntityManagerFactory entityManagerFactory;

	public static ApplicationContext getInstance() {
		return INSTANCE;
	}

	public ApplicationContext() {
		this.init();
	}

	/**
	 * 
	 */
	private void init() {
		String configFile = System.getProperty("config.file");
		File file = new File(configFile);
		if (!file.exists()) {
			return; // TBD - throw exception
		}
		config = unmarshal(file, Config.class);
		Properties properties = this.getProperties(config.getProperties(), "datasource");
		dataSource = this.createDataSource(properties);
		try {
			Connection connection = dataSource.getConnection();
			DatabaseMetaData databaseMetaData = connection.getMetaData();
			LOG.info(databaseMetaData.getDriverName(), databaseMetaData.getDriverVersion(), databaseMetaData.getDriverMajorVersion(), databaseMetaData.getDriverMinorVersion(), databaseMetaData.getURL());
		} catch (SQLException exception) {
			LOG.error(exception, exception);
		}
	}

	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}

	/**
	 * 
	 * @param properties
	 * @param startsWith
	 * @return
	 */
	private Properties getProperties(List<Property> properties, String startsWith) {
		Properties outProperties = new Properties();
		for (Property property : config.getProperties()) {
			String name = property.getName();
			if (name.startsWith(startsWith)) {
				outProperties.setProperty(name.substring(name.indexOf(".") + 1), property.getValue());
			}
		}
		return outProperties;
	}

	/**
	 * 
	 * @param properties
	 * @return
	 */
	private DataSource createDataSource(Properties properties) {
		DataSourceFactory dataSourceFactory = new DataSourceFactory();
		try {
			return dataSourceFactory.createDataSource(properties);
		} catch (Exception exception) {
			LOG.error(exception.getLocalizedMessage(), exception);
		}
		return null;
	}

	/**
	 * 
	 * @return
	 */
	private EntityManagerFactory createEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("quotingPersistentUnit");
	}

	/**
	 * 
	 * @return
	 */
	public Session createSession() {
		return this.getEntityManager().unwrap(Session.class);
	}

	/**
	 * 
	 * @return
	 */
	public EntityManager getEntityManager() {
		if (entityManagerFactory == null) {
			entityManagerFactory = this.createEntityManagerFactory();
		}
		return entityManagerFactory.createEntityManager();
	}

	/**
	 * 
	 * @param xmlFile
	 * @param type
	 * @return
	 */
	private static <T> T unmarshal(File xmlFile, Class<T> type) {
		try {
			Object object = null;
			final JAXBContext context = JAXBContext.newInstance(type);
			final javax.xml.bind.Unmarshaller unmarshaller = context.createUnmarshaller();
			object = unmarshaller.unmarshal(xmlFile);
			return type.cast(object);
		} catch (JAXBException exception) {
			exception.printStackTrace();
		}
		return null;
	}

}
