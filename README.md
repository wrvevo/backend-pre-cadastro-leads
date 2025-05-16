# Backend - Pré-Cadastro de Leads

Este repositório contém uma aplicação backend em Spring Boot para processar pré-cadastro de leads, com estrutura simples, documentação via Swagger e testes unitários com JUnit 5.

## 🔧 Tecnologias

- Java 17
- Spring Boot 3.1
- Spring Web
- Springdoc OpenAPI (Swagger)
- JUnit 5

## 📁 Estrutura de Pastas

```
src/
├── main/
│   ├── java/com/example/leads/
│   │   ├── config/            # Swagger config
│   │   ├── controller/        # REST endpoint
│   │   ├── model/             # Objeto Lead
│   │   └── service/           # Regra de negócio
└── test/
    └── java/com/example/leads/service/LeadServiceTest.java
```

## 🚀 Como Executar

```bash
./mvnw spring-boot:run
```

## 🧪 Testes

```bash
./mvnw test
```

## 📖 Swagger

Após start:

```
http://localhost:8080/swagger-ui.html
```

## 📦 Build

```bash
./mvnw clean install
```

## 📝 Licença

MIT