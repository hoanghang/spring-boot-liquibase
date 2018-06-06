# spring-boot-liquibase
Demo spring boot and liquibase connect to MySQL DB


How to use liquibase?
1. Add dependency in pom.xml
        <dependency>
            <groupId>org.liquibase</groupId>
            <artifactId>liquibase-core</artifactId>
            <version>3.4.1</version>
        </dependency>
Using liquibase 3.4.1

2.  Create folder "changelog" (resource/changelog)
    Create file   "db.changelog-master.xml" (resource/changelog/db.changelog-master.xml)

3. In application.properties update liquibase properties
    spring.liquibase.enabled=true
    spring.liquibase.change-log=classpath:changelog/db.changelog-master.xml

4. Create file => update DB 
Ex: "db.changelog-customer-add-0.0.1.xml" (resource/changelog/db.changelog-customer-add-0.0.1.xml)

Liquibase support XML, YAML, JSON format. 
Document https://www.liquibase.org/documentation/changes/insert.html
