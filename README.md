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
 https://gleice-login-api.herokuapp.com/

Criacao - Usei a ferramenta postman
https://gleice-login-api.herokuapp.com/criar
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
 
https://gleice-login-api.herokuapp.com/logar
    
    {
      
        "email": "joao555@silva.org",
        "password": "hunter2"
}
https://gleice-login-api.herokuapp.com/perfil

Nesse passo informe o Json retornado pela ulr logar.



