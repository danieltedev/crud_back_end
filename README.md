# CrudFrontEnd

This project was generated with [Spring initializr](https://start.spring.io/) version 2.3.0.

## Development server


Inicie o servidor com o comamdno `mvn spring-boot:run` para consegir usar esse back-end junto com o [crud_font_end](https://github.com/danieltedev/crud_font_end). Navegue até `http://localhost:8080/h2-console` para acessa o banco de dados.

Com o postman você consegue usar os serviços:

```
GET     localhost:8080/pessoa
GET     localhost:8080/pessoa/id
POST    localhost:8080/pessoa
BODY:
```json
{
    "nome": "daniel teixei elizeu",
    "dataNascimento": "1989-05-08"
}
```
PUT     localhost:8080/pessoa
BODY:
```json
{
    "id": 1,
    "nome": "daniel teixei elizeu",
    "dataNascimento": "1989-05-08"
}
```
DELETE  localhost:8080/pessoa/id
```