dataSource {
    pooled = true
    jmxExport = true
    driverClassName = "com.mysql.jdbc.Driver"
    username = "root"
    password = ""
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
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            //url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
            url = "jdbc:mysql://localhost/gTunes"
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
            url = "jdbc:mysql://localhost/gTunes"
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
