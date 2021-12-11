# Cities API

Foi desenvolvido um pequeno sistema que gerencia cidades, estados e paises e que também realiza calculo da distancia entre duas cidades através de uma API REST, criada com Spring Boot

Este Projeto fui realizando seguindo como base o projeto "Construindo uma API Rest de consulta de cidades do brasil do zero até a produção" realizado pelo André Gomes na plataforma online Digital Innovation One

### Foi desenvolvido utilizando:

* Java 11
* Spring (sendo gerado pelo Spring Boot Initialzr o setup inicial) 
* Docker (para rodar o banco de dados  Postgres)
* IntelliJ Community
* Heroku CLI
* Git 

## Base de Dados

O Banco de dados dessa aplicação foi populado com:
* [chinnonsantos/sql-paises-estados-cidades](https://github.com/chinnonsantos/sql-paises-estados-cidades)

Utilizando os dados presentes na pasta do PostgresSQL

E  utilizando das extensões: 

* cube
* earthdistance

Para realizar os calculos de distancia, no caso da Extensão cube em `metros` e na Estensão  earthdistance em `milhas`


## Foram utilizdos como dependências desse projeto 

* spring-boot-starter-data-jpa
* spring-boot-starter-web
* hibernate-types-52, na versão 2.14.0
* postgresql

## Aviso!

Durante a execução do projeto, encontrei um problema na utilização das annotations do Hibernate:
```
@Type
@TypeDef
@TypeDefs 
```
Que na versão utilizada do Hibernate (5.6.2.Final) se encontram no estado de abosoleto. Porém optei por deixar o código da mesma forma em que estava no projeto original, por conseguir rodar do mesmo jeito a aplicação. 

No momento em que foi realizado esse projeto não possui uma substituição para eles como mostra na pergunta deixada no stackoverflow sobre isso ([link](https://stackoverflow.com/questions/69858533/replacement-for-hibernates-deprecated-type-annotation)).
