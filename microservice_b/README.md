# quarkus-microservices
This microservice process requests to **save** and **get** **Article** objects from the database.

## How to run
+ Install [maven](https://maven.apache.org/) in your machine
+ Set the maven as a **enviroment variable** if you still dont have it
+ Configure the postgresql database connection in the file `microservice_b/src/main/resources/application.properties`
+ Inside the folder **microservice_a** run `./mvn package`
+ still in the root folder execute the application with `java -jar target/microservice_b-1.0.0-SNAPSHOT-runner.jar`

_Done! you are running your **quarkus app**._
