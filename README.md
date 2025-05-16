# Backend - Pré-Cadastro de Leads

Este projeto representa o backend da solução de pré-cadastro de leads utilizando Spring Boot, arquitetura hexagonal, Kafka e PostgreSQL.

## Tecnologias

- Java 17
- Spring Boot
- Spring Data JPA
- Spring Security
- Kafka / Kafka Streams
- PostgreSQL
- Docker e Docker Compose

## Como Executar

```bash
# compilar
./mvnw clean install

# rodar local
./mvnw spring-boot:run
```

## Docker Compose

```bash
docker-compose up -d
```

## Documentação da API

Após start:
```
http://localhost:8080/swagger-ui.html
```

## Estrutura

- `domain` — regras de negócio e entidades
- `application` — casos de uso e ports
- `adapter.in.web` — controllers REST
- `adapter.out.persistence` — JPA
- `adapter.out.kafka` — producer
- `config` — segurança, Kafka, Swagger

## Licença

MIT