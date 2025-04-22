# 🕹️ Projeto Loja de Games em Java

Este é um projeto backend desenvolvido em **Java com Spring Boot**, que simula uma API REST para uma loja de games. A aplicação permite o cadastro de produtos e categorias, com relacionamento entre eles e operações CRUD completas.

## 🚀 Funcionalidades

- ✅ Cadastro, listagem, atualização e remoção de **Categorias**
- ✅ Cadastro, listagem, atualização e remoção de **Produtos**
- ✅ Relacionamento `OneToMany` entre `Categoria` e `Produto`
- ✅ Filtros por nome (ignora letras maiúsculas/minúsculas)
- ✅ Validações com Bean Validation (uso de anotações como `@NotBlank`, `@Positive`, `@Min`, etc., para garantir dados corretos na entrada da API)
- ✅ Testes via **Insomnia/Postman** (arquivo incluso)

## 🔧 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
  - `spring-boot-starter-data-jpa`
  - `spring-boot-starter-validation`
  - `spring-boot-starter-web`
  - `spring-boot-devtools`
  - `spring-boot-starter-test`
- **MySQL** (com `mysql-connector-j`)
- **Maven**

## 🧠 Estrutura das Entidades

### 📦 Categoria

- `id`: Long
- `nome`: String (obrigatório)
- `descricao`: String (obrigatório)
- `produtos`: Lista de produtos associados

### 🎮 Produto

- `id`: Long
- `nome`: String (obrigatório)
- `descricao`: String (obrigatório)
- `preco`: BigDecimal (deve ser positivo)
- `estoque`: Integer (deve ser positivo)
- `categoria`: Objeto Categoria (chave estrangeira)

## 🔗 Relacionamento

- Uma `Categoria` pode ter vários `Produtos`
- Um `Produto` pertence a apenas uma `Categoria`

## 🧪 Testes com Insomnia/Postman

Um arquivo .json com as requisições já prontas está disponível na pasta postman.
Basta importar no Insomnia/Postman e começar a testar!

▶️ Como Rodar o Projeto
1. Clone o repositório
2. Configure o banco de dados MySQL no arquivo application.properties:
    Abra o arquivo src/main/resources/application.properties e configure os parâmetros de conexão com o banco de dados MySQL de acordo com o que está configurado no seu ambiente local:

    spring.datasource.url=jdbc:mysql://localhost:3306/loja_games
    spring.datasource.username=seu_usuario       # Substitua 'seu_usuario' pelo nome de usuário do MySQL da sua máquina
    spring.datasource.password=sua_senha         # Substitua 'sua_senha' pela senha do usuário do MySQL na sua máquina
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true

Importante: Lembre-se de substituir seu_usuario e sua_senha pelos dados corretos do MySQL configurados na sua máquina.

3. Execute a aplicação:
    Pela IDE:

    1. Abra o arquivo LojaGamesJavaApplication.java (classe principal do Spring Boot).

    2. Clique com o botão esquerdo do mouse em cima do arquivo.

    3. Procure e clique na opção Run Java para rodar a aplicação.

## 🌐 Outros Projetos

Confira outros projetos que estou desenvolvendo no meu [GitHub](https://github.com/heypamela) e não deixe de acompanhar no meu [LinkedIn](https://www.linkedin.com/in/pamelaoliveira14/).

