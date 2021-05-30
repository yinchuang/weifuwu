FROM maven:3.6-openjdk-8 as builder
COPY c-service /opt/c-service
COPY pom.xml /opt/pom.xml
RUN mvn -f /opt/c-service/pom.xml clean package

FROM openjdk:8-jdk-alpine
COPY --from=builder /opt/c-service/target/c-service-1.0.0-SNAPSHOT.jar app.jar
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone
ENTRYPOINT ["java","-jar","/app.jar"]
