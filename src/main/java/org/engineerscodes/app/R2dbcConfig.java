package org.engineerscodes.app;

import io.r2dbc.spi.ConnectionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.core.R2dbcEntityOperations;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.data.r2dbc.dialect.PostgresDialect;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.r2dbc.connection.R2dbcTransactionManager;
import org.springframework.r2dbc.core.DatabaseClient;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import org.springframework.transaction.ReactiveTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@EnableR2dbcRepositories(basePackages = "org.engineerscodes.app.r2dc",
        entityOperationsRef = "db2EntityManagerFactory")
@EntityScan(basePackages = "org.engineerscodes.app.r2dc")
public class R2dbcConfig  {

    @Bean
    @Qualifier("postgresql")
    public ConnectionFactory postgresqlConnectionFactory() {
        return new PostgresqlConnectionFactory(
                PostgresqlConnectionConfiguration.builder()
                        .host("localhost")
                        .port(5432)
                        .username("postgres")
                        .password("naveen")
                        .database("BigData")
                        .build()
        );
    }

    @Bean(name = "db2EntityManagerFactory")
    public R2dbcEntityOperations postgresqlR2dbcEntityOperations(@Qualifier("postgresql") ConnectionFactory connectionFactory) {

        DatabaseClient databaseClient = DatabaseClient.create(connectionFactory);

        return new R2dbcEntityTemplate(databaseClient, PostgresDialect.INSTANCE);
    }
}