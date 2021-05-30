FROM maven:3.6-openjdk-8 as builder
COPY a-service /opt/a-service
COPY pom.xml /opt/pom.xml
RUN mvn -f /opt/a-service/pom.xml clean package

FROM openjdk:8-jdk-alpine
COPY --from=builder /opt/a-service/target/a-service-1.0.0-SNAPSHOT.jar app.jar
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone
ENTRYPOINT ["java","-jar","/app.jar"]
