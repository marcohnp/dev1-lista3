# dev1-lista3

### Endpoints
1. GET - http://localhost:8080/contatos - Retorna lista de contatos do banco H2-Database. HTTP Status: 200 - OK.
2. GET - http://localhost:8080/contatos/{id} - Retorna contato de acordo com o id informado. HTTP Status: 200 - OK.
3. POST - http://localhost:8080/contatos - Salva contato no banco H2-Database e retorna contato salvo. HTTP Status: 201 - Created.
4. PUT - http://localhost:8080/contatos/{id} - Atualiza dados do contato no banco H2-Database informado e retorna contato atualizado. HTTP Status: 200 - OK.
5. DELETE - http://localhost:8080/contatos/{id} - Deleta contato informado do banco. Http Status: 204 - No content.

### H2-Database
H2-Database é um banco em memória utilizado para ambientes de testes. ele pode ser acessado pela url http://localhost:8080/h2-console/ não precisa de senha.

### Exceptions customizadas:
As seguintes exceptions customizadas foram implementadas:
- ContatoNotFoundException.class - HTTP Status: 404 - Not found.
- RequestInvalidaException.class - HTTP Status: 400 - Bad request.

### Exemplo de Request:
``` json
{
   "nomeCompleto": "João Silva",
    "telefone": "51998889999"
}
```

### Arquitetura
Projeto foi desenvolvido utilizando o Design Pattern Facade e Mapper.
