# login-API
API RESTful de criação de usuários e login.
    - Banco H2;
    - Build com Maven;
    - Persistência com Hibernate;
    - Framework Spring;
    - Java 8;
    - Testes com JUnit;


Todos os endpoints aceitam e respondem somente JSON

Teste home
http://localhost:8080/

Criacao
localhost:8080/criar
{
        "nome": "João da Silva Santos",
        "email": "joao555@silva.org",
        "password": "hunter2",
        "phones": [
            {
                "number": "987654321",
                "ddd": "21"
            }
        ]
    }
 
http://localhost:8080/logar
    
    {
      
        "email": "joao555@silva.org",
        "password": "hunter2"
}

http://localhost:8080/perfil

{
        "id": 1,
        "nome": "João da Silva Santos",
        "email": "joao555@silva.org",
        "password": "hunter2",
        "created": 1548304030017,
        "modified": 1548304030017,
        "last_login": 1548304297488,
        "token": "cb2d6523-bfdb-459c-8a39-82c054c75d12",
        "phones": [
            {
                "id": 1,
                "number": "987654321",
                "ddd": "21"
            }
        ]
}



