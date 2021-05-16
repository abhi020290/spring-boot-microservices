FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/cloud-gateway-*.jar
RUN mkdir -p /opt/app/cloud-gateway
ENV APP_HOME /opt/app/cloud-gateway
COPY ${JAR_FILE} $APP_HOME/cloud-gateway.jar
WORKDIR $APP_HOME
EXPOSE 9191
ENTRYPOINT ["java","-jar","cloud-gateway.jar"]