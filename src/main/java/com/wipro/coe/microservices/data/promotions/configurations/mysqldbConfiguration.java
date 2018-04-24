package com.wipro.coe.microservices.data.promotions.configurations;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

/**
 * The accounts Spring configuration.
 * 
 * @author Ranajit-Jana

@Configuration
@ComponentScan
@EntityScan("com.wipro.coe.microservices.data.promotions.entity")
@EnableJpaRepositories("com.wipro.coe.microservices.data.promotions")
@PropertySource("classpath:db-config.properties")
 */
public class mysqldbConfiguration {

	protected Logger logger;

	public mysqldbConfiguration() {
		logger = Logger.getLogger(getClass().getName());
	}

	/**
	 * Creates an in-memory "promotions" database populated with test data for fast
	 * testing
	 */
	@Bean
	public DataSource dataSource() {
		logger.info("dataSource() invoked");

		// Create an in-memory H2 relational database containing some demo
		// promotions.
		DataSource dataSource = (new EmbeddedDatabaseBuilder()).addScript("classpath:testdb/schema.sql")
				.addScript("classpath:testdb/data.sql").build();

		logger.info("dataSource = " + dataSource);

		// Sanity check
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Map<String, Object>> promotions = jdbcTemplate.queryForList("SELECT description FROM promotion");
		logger.info("System has " + promotions.size() + "promotion");


		return dataSource;
	}
}
