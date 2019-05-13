R2DBC Demo
==========

### Databases

* H2
* PostgreSQL
* MySQL: jasync-r2dbc-mysql  https://github.com/r2dbc/r2dbc-client/blob/master/src/test/java/io/r2dbc/client/MysqlExample.java

### Features

* flyway to init database
* database-rider to manage dataset
* r2dbc for reactive
* BLOB/CLOB API: https://github.com/r2dbc/r2dbc-spi/issues/41

### R2DBC Connection URLs

R2DBC Connection URL support: https://github.com/r2dbc/r2dbc-spi/pull/48

```
r2dbc:mysql://localhost:3306/my_database?locale=en_US
\___/ \___/\_______________/\__________/\___________/
  |     |             |          |           |
scheme  sub-scheme  authority   path       query
```

# References

* R2DBC Home: http://r2dbc.io/
* R2DBC Specification: http://r2dbc.io/spec/1.0.0.M7/spec/html/
* Spring Data R2DBC 1.0 M1 released: https://spring.io/blog/2018/12/12/spring-data-r2dbc-1-0-m1-released
* Spring Data R2DBC - Reference Documentation: https://docs.spring.io/spring-data/r2dbc/docs/1.0.x/reference/html/
* Asynchronous RDBMS access with Spring Data R2DBC: https://lankydanblog.com/2019/02/16/asynchronous-rdbms-access-with-spring-data-r2dbc/
* jasync-sql: https://github.com/jasync-sql/jasync-sql
