FROM openjdk:8-jdk-alpine
ARG JAR_FILE=/home/runner/work/weifuwu/weifuwu/a-service/target//*.jar
COPY ${JAR_FILE} app.jar
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone
ENTRYPOINT ["java","-jar","/app.jar"]
