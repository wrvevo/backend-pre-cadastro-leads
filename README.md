
# BACKEND - Pré-Cadastro de Leads

Este projeto demonstra uma arquitetura hexagonal com Spring Boot e Kafka para captação de leads durante uma campanha de marketing massiva.

## Camadas
- **Domain**: Entidades e regras de negócio.
- **Application**: Casos de uso.
- **Adapters**: Entradas (REST Controller) e saídas (Kafka, Banco).
- **Configuration**: Bootstrap da aplicação.

## Tecnologias
- Java 17
- Spring Boot 3.x
- Apache Kafka + Kafka Streams
- PostgreSQL
- Arquitetura Hexagonal
- Docker

## Como executar

```bash
./mvnw spring-boot:run
```

## Como testar

```bash
./mvnw test
```

## Estrutura de pacotes

- `domain` – Entidade Lead
- `application.port.in` – Interface LeadUseCase
- `application.port.out` – Interfaces para persistência e Kafka
- `application.service` – Implementação do caso de uso
- `adapter.in.web` – REST Controller
- `adapter.out.persistence` – Repositório JPA
- `adapter.out.kafka` – Publicador Kafka

## 💻 Testes com Postman

A coleção `PreCadastroLeads.postman_collection.json` está incluída na pasta `/collections`.

### Como usar

1. Importe no Postman: `File > Import > Upload Files`
2. Escolha a coleção `PreCadastroLeads.postman_collection.json`
3. Execute a requisição `Cadastrar Lead` para testar a API em `http://localhost:8080/api/v1/leads`

### Payload de exemplo:
```json
{
  "nome": "João da Silva",
  "cpf": "12345678901",
  "email": "joao@email.com"
}
```

A resposta e o log do consumidor Kafka indicarão que o lead foi enviado com sucesso para processamento assíncrono.

## Licença
MIT