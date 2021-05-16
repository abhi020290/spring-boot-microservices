FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/service-registry-*.jar
RUN mkdir -p /opt/app/service-registry
ENV APP_HOME /opt/app/service-registry
COPY ${JAR_FILE} $APP_HOME/service-registry.jar
WORKDIR $APP_HOME
EXPOSE 8761
ENTRYPOINT ["java","-jar","service-registry.jar"]