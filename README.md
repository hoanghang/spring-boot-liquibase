# spring-boot-liquibase
Demo spring boot and liquibase connect to MySQL DB


How to use liquibase?
1. Add dependency in pom.xml </br>
        <dependency></br>
            <groupId>org.liquibase</groupId></br>
            <artifactId>liquibase-core</artifactId></br>
            <version>3.4.1</version></br>
        </dependency></br>
Using liquibase 3.4.1</br>

2.  Create folder "changelog" (resource/changelog) </br>
    Create file   "db.changelog-master.xml" (resource/changelog/db.changelog-master.xml)</br>

3. In application.properties update liquibase properties</br>
    spring.liquibase.enabled=true</br>
    spring.liquibase.change-log=classpath:changelog/db.changelog-master.xml</br>

4. Create file => update DB </br>
Ex: "db.changelog-customer-add-0.0.1.xml" (resource/changelog/db.changelog-customer-add-0.0.1.xml)</br>

Liquibase support XML, YAML, JSON format. </br>
Document https://www.liquibase.org/documentation/changes/insert.html</br>
