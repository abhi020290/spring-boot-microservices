FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/user-service-*.jar
RUN mkdir -p /opt/app/user-service
ENV APP_HOME /opt/app/user-service
COPY ${JAR_FILE} $APP_HOME/user-service.jar
WORKDIR $APP_HOME
EXPOSE 9001
ENTRYPOINT ["java","-jar","user-service.jar"]