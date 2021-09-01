# clusus datawarehouse

## SpringBoot 4, Hibernate 4, MySQL 5, and java 8

##Main Purposes

###ClusteredData Warehouse

Suppose you are part of a scrum team developing data warehouse for Bloomberg to analyze FX deals. One of customer stories is to accept deals details from and persist them into DB

Request logic as following :

Request Fields(Deal Unique Id, From Currency ISO Code "Ordering Currency", To Currency ISO Code, Deal timestamp, Deal Amount in ordering currency).
Validate row structure.(e.g: Missing fields, Type format..etc. We do not expect you to cover all possible cases but we'll look to how you'll implement validations)
System should not import same request twice.
No rollback allowed, what every rows imported should be saved in DB..

Technical Specs :

Access to DB should be through JPA.
For DB type, i am using MYSQL
Provide a web interface for uploading files and inquire about results "using filename" following web applications 3 tier architecture.

###Info
Upload multiple file and store into the database and download file 

For configuration of Spring MVC, it uses Java config instead of xml config.
For Hibernate 4 and MySQL, please modify src/main/resources/application.properties file
Build and run the app in command line environment

###1.Create table in MySQL

Copy the text in src/main/resources/sample/clusus.sql and run it to create a table in MySQL.
mysql >> use clusus_db
mysql >> source pathof.sql file

how  to run project in eclipse:
step 1: goto file in eclipse and click import 
step2: import as maven and existing project
step3: mvn clean install
step4: mvn spring-boot:run or
you can simply run right click and run java application SpringBootWebApplication.java file
Go to http://localhost:8099/ and test it.





