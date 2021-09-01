From openjdk:8
copy ./target/clustered-data-0.0.1-SNAPSHOT.jar clustered-data-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","clustered-data-0.0.1-SNAPSHOT.jar"]