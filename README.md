# spring-boot-microservices
    spring-boot-microservices

# Mvn command
    ./mvnw clean install
# Docker compose
    change the host ip in docker-compose yml file
    docker-compose build
    docker-compose up
# API Details

    Hystrix Dashboard
    http://localhost:9295/hystrix
    Add the below stream path in hystrix
    http://localhost:9191/actuator/hystrix.stream

#API Gateway
User Service

    http://localhost:9191/api/users/

Department Service

    http://localhost:9191/api/department/
