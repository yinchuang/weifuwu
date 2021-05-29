FROM openjdk:8-jdk-alpine
COPY /home/runner/work/weifuwu/weifuwu/gateway-service/target/gateway-service-1.0.0-SNAPSHOT.jar app.jar
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone
ENTRYPOINT ["java","-jar","/app.jar"]
