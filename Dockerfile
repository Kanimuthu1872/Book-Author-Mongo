FROM openjdk:17-oracle
COPY ./target/Book_Services-0.0.1-SNAPSHOT.jar book-service-registry.jar
CMD ["java","-jar","book-service-registry.jar"]