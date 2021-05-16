FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/department-service-*.jar
RUN mkdir -p /opt/app/department-service
ENV APP_HOME /opt/app/department-service
COPY ${JAR_FILE} $APP_HOME/department-service.jar
WORKDIR $APP_HOME
EXPOSE 9002
ENTRYPOINT ["java","-jar","department-service.jar"]