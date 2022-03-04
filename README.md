# Consumindo API em Java.

O script deve consumir uma API REST do IBGE e com sua resposta realizar uma conversão para um arquivo CSV com a quantidade de estados por região.

O código foi criado usando o framework spring Boot com as dependencias:
Spring Cloud, Spring Web, Spring Boot Devtools, OpenFeign entre outros.

Para rodar em sua máquina baixe o zip, ou clone esse repositório e rode em uma IDE voltada para Java (Eclipse, IntelliJ, Netbeans). Para fazer o projeto funcionar, é preciso clicar em 'run as java aplicattion' em EdiLabsApplication, feito isso abra o Postman e coloque o http//localhost:8080/
Essas são as requisições, qualquer numero de 1-5 no lugar do {id} das regiões: 
 {id}/estados - Traz os estados da região.
 {id}/regiao - Retorna a quantidade de estados da região.
 {id}/regiaoNome - Traz o nome da região.
 {id}/csv - Cria um arquivo Excel na pasta da aplicação Java com o nome e quantidade de estados da região.
 {id}/allCSV - Cria um arquivo Excel na pasta da aplicação Java com o nome e quantidade de estados de todas as regiões.

Essas requisições utilizam o método GET para retornar as solicitações feitas para a API IBGE.
 
