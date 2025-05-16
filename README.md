

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
