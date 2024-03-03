ARG JAVA_VERSION=15
FROM openjdk:${JAVA_VERSION}
COPY target/ees-intranet-ms-eureka-server.jar ees-intranet-ms-eureka-server.jar
EXPOSE 8761
ENTRYPOINT ["java","-Dspring.profiles.active=prod","-jar","/ees-intranet-ms-eureka-server.jar"]