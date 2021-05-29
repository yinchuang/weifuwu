FROM openjdk:8-jdk-alpine
#ARG JAR=/home/runner/work/weifuwu/weifuwu/a-service/target/*.jar
COPY /home/runner/work/weifuwu/weifuwu/a-service/target/*.jar app.jar
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone
ENTRYPOINT ["java","-jar","/app.jar"]
