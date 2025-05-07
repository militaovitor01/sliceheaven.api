# Slice Heaven API

API RESTful para gerenciamento de uma pizzaria, incluindo pizzas, bebidas e sobremesas.

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## 📋 Pré-requisitos

- Java 17 ou superior
- Maven
- MySQL

## 🔧 Configuração do Ambiente

1. Clone o repositório
2. Configure o banco de dados PostgreSQL
3. Configure as variáveis de ambiente no arquivo `application.properties`
4. Por padrão, no arquivo application.properties, user está configurado como 'root' e password como 'password'. Você deve trocar para as suas configurações padrão do MySQL locamente.
5. Execute o projeto usando Maven:
```bash
mvn spring-boot:run
```

## 📚 Documentação da API

### Pizzas

#### Listar Pizzas
```http
GET /pizzas
```
Retorna uma lista paginada de pizzas ativas.
- Parâmetros de paginação:
  - size: número de itens por página (padrão: 10)
  - sort: campo para ordenação (padrão: name)

#### Cadastrar Pizza
```http
POST /pizzas
```
Cadastra uma nova pizza.

Corpo da requisição:
```json
{
    "name": "string",
    "description": "string",
    "price": "decimal",
    "imageUrl": "string",
    "category": "string",
    "subCategory": "string",
    "featured": "boolean",
    "rating": "decimal",
    "discount": "integer"
}
```

#### Atualizar Pizza
```http
PUT /pizzas
```
Atualiza uma pizza existente.

Corpo da requisição:
```json
{
    "id": "long",
    "name": "string",
    "price": "decimal",
    "discount": "integer"
}
```

#### Deletar Pizza
```http
DELETE /pizzas/{id}
```
Marca uma pizza como inativa.

### Bebidas

#### Listar Bebidas
```http
GET /drinks
```
Retorna uma lista paginada de bebidas.
- Parâmetros de paginação:
  - size: número de itens por página (padrão: 10)
  - sort: campo para ordenação (padrão: name)

#### Cadastrar Bebida
```http
POST /drinks
```
Cadastra uma nova bebida.

Corpo da requisição:
```json
{
    "name": "string",
    "description": "string",
    "price": "decimal",
    "imageUrl": "string",
    "category": "string",
    "featured": "boolean",
    "discount": "integer"
}
```

#### Atualizar Bebida
```http
PUT /drinks
```
Atualiza uma bebida existente.

Corpo da requisição:
```json
{
    "id": "long",
    "name": "string",
    "price": "decimal",
    "discount": "integer"
}
```

#### Deletar Bebida
```http
DELETE /drinks/{id}
```
Remove uma bebida.

### Sobremesas

#### Listar Sobremesas
```http
GET /desserts
```
Retorna uma lista paginada de sobremesas.
- Parâmetros de paginação:
  - size: número de itens por página (padrão: 10)
  - sort: campo para ordenação (padrão: name)

#### Cadastrar Sobremesa
```http
POST /desserts
```
Cadastra uma nova sobremesa.

Corpo da requisição:
```json
{
    "name": "string",
    "description": "string",
    "price": "decimal",
    "imageUrl": "string",
    "category": "string",
    "featured": "boolean",
    "discount": "integer"
}
```

#### Atualizar Sobremesa
```http
PUT /desserts
```
Atualiza uma sobremesa existente.

Corpo da requisição:
```json
{
    "id": "long",
    "name": "string",
    "price": "decimal",
    "discount": "integer"
}
```

#### Deletar Sobremesa
```http
DELETE /desserts/{id}
```
Remove uma sobremesa.

## 📝 Notas

- Todos os endpoints retornam respostas HTTP apropriadas (200, 201, 204, 400, 404, etc.)
- A paginação é implementada em todos os endpoints de listagem
- Validações são aplicadas em todos os campos obrigatórios
- As datas são gerenciadas automaticamente pelo sistema

## 🔒 Segurança

- Implemente autenticação e autorização antes de usar em produção
- Configure CORS adequadamente para seu ambiente
- Use HTTPS em produção

## 🤝 Contribuição

1. Faça o fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request 
