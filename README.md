# Exemplo-Spring-Boot

Este repositório contém um exemplo básico de aplicação utilizando [Spring Boot](https://spring.io/projects/spring-boot). O objetivo é demonstrar como estruturar um projeto Java com Spring Boot, incluindo exemplos de endpoints REST e integração com HTML.

## Tecnologias Utilizadas

- **Java** (30.8%)
- **Spring Boot**
- **HTML** (69.2%)

## Funcionalidades

- Estrutura básica de um projeto Spring Boot
- Exemplos de endpoints REST
- Servir páginas HTML estáticas ou dinâmicas
- Organização de pacotes recomendada

## Como Executar

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/AndreNazario/Exemplo-Spring-Boot.git
   cd Exemplo-Spring-Boot
   ```

2. **Execute o projeto:**
   - Via Maven:
     ```bash
     ./mvnw spring-boot:run
     ```
   - Ou importe para sua IDE favorita e execute a classe principal (`@SpringBootApplication`).

3. **Acesse no navegador:**
   - Endereço padrão: [http://localhost:8080](http://localhost:8080)

## Estrutura do Projeto

```
Exemplo-Spring-Boot/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── ... (código-fonte Java/Spring Boot)
│   │   └── resources/
│   │       └── static/ (arquivos HTML)
│   └── test/
├── pom.xml
└── README.md
```

## Contribuição

Sinta-se à vontade para abrir issues ou pull requests para sugerir melhorias ou corrigir problemas.

## Licença

Este projeto está sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.

---

> Projeto criado por [AndreNazario](https://github.com/AndreNazario)
