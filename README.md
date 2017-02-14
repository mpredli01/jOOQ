
## Data Geekery Releases Version 3.9.0 of jOOQ, a Java ORM Tool for Building Type Safe Queries

### InfoQ Java Queue

#### published February 14, 2017

This example application demonstrates how to setup and run a [jOOQ](https://www.jooq.org/) project. 

##### Database Setup

This example uses MySQL as the database:

`mysql> CREATE DATABASE pubs;`

`$ mysql -u username [options] pubs < [path]/pubs.sql`

The SQL file, `pubs.sql`, is included in this project.

##### Application Build and Execution

The application can be built with [Maven](http://maven.apache.org/) by executing the following command:

`mvn clean compile`

jOOQ will generate the necessary Java code from the database which will be located in the folder, `src/main/java/org/redlich/pubs/model/tables`, followed by compiling all the relevant source code.

To execute the application:

`mvn exec:java -Dexec.mainClass=org.redlich.pubs.Application -Dexec.cleanupDaemonThreads=false`

Please don't hesitate to contact me at [mike@redlich.net](mailto:mike@redlich.net) with any questions.
