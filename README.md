# Backend - Arquitetura Hexagonal com Swagger e JUnit

Este projeto implementa a solução de pré-cadastro de leads com arquitetura hexagonal (Ports and Adapters), documentação com Swagger e testes unitários com JUnit.

## 📚 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Swagger (Springdoc OpenAPI)
- JUnit 5
- Mockito

## 🔌 Arquitetura Hexagonal

- `domain/model`: Entidades de negócio
- `application/port/in`: Interfaces dos casos de uso
- `application/port/out`: Interfaces para adaptadores externos
- `application/service`: Casos de uso
- `adapter/in/web`: Controllers REST
- `adapter/out/repository`: Repositórios (ex: JPA)
- `adapter/out/kafka`: Produção de eventos
- `config`: Swagger e beans globais

## 🧪 Testes

```bash
./mvnw test
```

## 🚀 Execução

```bash
./mvnw spring-boot:run
```

## 📖 Swagger

Acesse após start:
```
http://localhost:8080/swagger-ui.html
```

## 🐳 Dockerfile

```dockerfile
FROM eclipse-temurin:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
```

## 📦 Build para Docker

```bash
./mvnw clean install -DskipTests
docker build -t pre-cadastro-backend .
```

## 📝 Licença

MIT