# SpringSecurity + JWT

# Utilizados:
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
 
# Feito de inicio uma inicialização onde tem 2 tipos de usuários diferentes.

* Solução encontrada para Spring Boot versão 3.2.3, WebSecurityConfig não está disponivel para esta versão
porém utilizando o código da WebSecurityConfig está a solução encontrada!

* Trocado anyRequest por requestMatchers no WebSecurityConfig, assim funcionando corretamente a página!

* Adicionando JWT ao projeto!
* Obs.: Geração de token ok!
* Obs.: Validação de token sendo resolvido!

* Adicionado ProstGreSQL, modificações de registro e login de usuários.

* Pode-se testar com o Postman (ou outros apps) com o metódo POST para validação de usuários!