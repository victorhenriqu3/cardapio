<h1 align="center">Cardápio Digital (Backend)</h1>
<p align="center">
  <a href="#pre-requisites">Pré-requisitos</a> •
  <a href="#how-to-use">Instalando o projeto</a> •
  <a href="#functional-requirements">Requisitos Funcionais</a>
</p>

O objetivo será criar uma REST API para que seja possível realizar as [funcionalidades pretendidas](#functional-requirements). foram utilizados Java Spring e Spring MVC para criação do servidor, Spring Data JPA para manipulação e persistência de dados, Lombok para geração de boilerplates e Postgres para banco de dados.

<h2 id="pre-requisites">💻 Requisitos</h2>

Para rodar esse projeto você precisa ter [Java](https://openjdk.org/) e [Maven](https://maven.apache.org/) instalado na sua máquina.

<h2 id="how-to-use"> 🚀 Instalando o projeto</h2>

Primeiro você deve clonar o repositório e acessá-lo :

```bash
# Clone o repositório
$ git clone https://github.com/victorhenriqu3/cardapio

# Acesse em
$ cd cardapio/Backend
```

<br>

O projeto conta com um arquivo [docker-compose.yml](./docker-compose.yml) responsável por criar uma instância de Banco de dados Postgres para poder testar a aplicação, para isso você irá precisar ter [Docker](https://www.docker.com/products/docker-desktop/) instalado na sua máquina.

```bash
# Cria a instância para poder ser acessada
docker-compose up -d

# execute para verificar se existe a instância "backend_postgres"
docker-compose ps
```

<h2 id="functional-requirements"> 📝 Requisitos Funcionais</h2>

A aplicação deve ser capaz de realizar as seguintes funcionalidades:

Comida:

- [x] Visualizar Todas as Comidas:
  - Corpo da Requisição: title,description,image,price
  - Corpo da Resposta: Array de Objetos( id,title,description,image,price )
- [x] Criar Comida:
  - Corpo da Requisição: title,description,image,price
  - Corpo da Resposta: Http Status
- [ ] Editar Comida:
  - Corpo da Requisição: id,title,description,image,price
  - Corpo da Resposta: Http Status
- [ ] Visualizar detalhes da Comida:
  - Corpo da Requisição: id
  - Corpo da Resposta: id,title,description,image,price
- [x] Deletar Comida:
  - Corpo da Requisição: id
  - Corpo da Resposta: Http Status

<hr>
<h3>Autor</h3>

<a href="https://www.linkedin.com/in/victorhenriqu3/">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/43153097?v=4" width="100px;" alt=""/>
 <br />
 <sub><b>Victor Henrique</b></sub></a> <a href="mailto:victorhenriqu3@outlook.com" title="Email"></a>

Feito com ❤️ por Victor Henrique.
<br/>👋🏽 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Victor%20Henrique-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/victorhenriqu3/)](https://www.linkedin.com/in/victorhenriqu3/)
[![Outlook Badge](https://img.shields.io/badge/-victorhenriqu3@outlook.com-blue?style=flat-square&logo=microsoft-outlook&logoColor=white&link=mailto:victorhenriqu3@outlook.com)](mailto:victorhenriqu3@outlook.com)
