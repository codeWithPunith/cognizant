# Microservices Multi-module Project

Start services in order:

1. Start Eureka:

```
mvn -pl eureka-discovery-server spring-boot:run
```

2. Start account and loan:

```
mvn -pl account spring-boot:run
mvn -pl loan spring-boot:run
```

3. Start gateway:

```
mvn -pl api-gateway spring-boot:run
```

Or build all modules:

```
mvn clean install
```
