dataSource {
    pooled = true
    jmxExport = true
    driverClassName = "org.postgresql.Driver" //com.mysql.jdbc.Driver
    dialect = "org.hibernate.dialect.PostgreSQLDialect"
    username = "barcelona"
    password = "barcelona"
    logSql = true
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
//    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
            //url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
            url = "jdbc:postgresql://localhost:5432/gtunes" //jdbc:mysql://localhost/gTunes
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost/gtunes"
            properties {
               // See http://grails.org/doc/latest/guide/conf.html#dataSource for documentation
               //jmxEnabled = true
               //initialSize = 5
               maxActive = -1
               //minIdle = 5
               //maxIdle = 25
               //maxWait = 10000
               //maxAge = 10 * 60000
               minEvictableIdleTimeMillis = 1800000
               timeBetweenEvictionRunsMillis = 1800000
               numTestsPerEvictionRun = 3
               validationQuery = "SELECT 1"
               //validationQueryTimeout = 3
               //validationInterval = 15000
               testOnBorrow = true
               testWhileIdle = true
               testOnReturn = true
               //jdbcInterceptors = "ConnectionState"
               //defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED
            }
        }
    }
}