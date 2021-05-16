FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/hystrix-dashboard-*.jar
RUN mkdir -p /opt/app/hystrix-dashboard
ENV APP_HOME /opt/app/hystrix-dashboard
COPY ${JAR_FILE} $APP_HOME/hystrix-dashboard.jar
WORKDIR $APP_HOME
EXPOSE 9295
ENTRYPOINT ["java","-jar","hystrix-dashboard.jar"]