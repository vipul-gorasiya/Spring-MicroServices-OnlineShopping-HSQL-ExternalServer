package com.vipul.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("development")
@Configuration
public class DevelopmentConfiguration {

	private final static Logger LOGGER = LoggerFactory.getLogger(DevelopmentConfiguration.class);

	/*@Value("${db.name}")
	private String databaseName;

	@Bean
	public DataSource dataSource() throws SQLException {
		DataSource dataSource = new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).setName(databaseName)
				.addScript("classpath:com/vipul/config/customer-schema-developement.sql").build();
		LOGGER.info("H2 database is running with metadata: {}", dataSource.getConnection().getMetaData().toString());
		return dataSource;
	}*/

}
