# Greetings API - Spring Boot

Este projeto é uma implementação básica de uma API RESTful usando Spring Boot, criada para fins de estudo e aprendizado de conceitos fundamentais de APIs e do framework Spring Boot.

## 📖 Sobre o Projeto

A aplicação é uma API simples que fornece uma saudação personalizada com base no parâmetro `name` fornecido. Se nenhum nome for fornecido, a API retorna uma saudação padrão para "World".

### Funcionalidades

- Retorna uma saudação personalizada.
- Incrementa automaticamente um contador de chamadas à API.
- Demonstra o uso de anotações básicas do Spring, como `@RestController`, `@RequestMapping` e `@RequestParam`.

## 🚀 Como Executar

### Pré-requisitos

- [Java 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) ou superior.
- [Maven](https://maven.apache.org/download.cgi).
- Um IDE compatível, como [IntelliJ IDEA](https://www.jetbrains.com/idea/) ou [Eclipse](https://www.eclipse.org/).

### Passos

1. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
   ```

2. Compile e execute o projeto:

   ```bash
   mvn spring-boot:run
   ```

3. Acesse o endpoint no navegador ou via ferramentas como cURL ou Postman:

   - URL base: `http://localhost:8080/greetings`
   - Parâmetro opcional: `name`

   **Exemplo de requisição:**

   - **Sem parâmetros:**
     ```bash
     curl http://localhost:8080/greetings
     ```
     **Resposta:**
     ```json
     {
       "id": 1,
       "content": "Hello, World!"
     }
     ```

   - **Com o parâmetro `name`:**
     ```bash
     curl http://localhost:8080/greetings?name=John
     ```
     **Resposta:**
     ```json
     {
       "id": 2,
       "content": "Hello, John!"
     }
     ```

## 📂 Estrutura do Projeto

```plaintext
src/main/java/com/example/greetings
│
├── controller
│   └── GreetingsController.java  # Controlador principal da API
│
├── Greetings.java                # Modelo representando a resposta da API
│
└── Application.java              # Classe principal para inicializar o Spring Boot
```

## 🛠️ Tecnologias Usadas

- **Java 17**: Linguagem de programação principal.
- **Spring Boot**: Framework para simplificar a criação de aplicações Java.
- **Maven**: Gerenciador de dependências e build.
- **REST API**: Padrão de comunicação para aplicações web.

