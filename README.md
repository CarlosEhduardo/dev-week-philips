# Semana Dev Week PHILIPS - FullStack

## Sobre o Projeto
Full-stack desenvolvido com o objetivo de trazer um projeto tecnologico para área de saúde com auxilio da PHILIPS e DIO. O projeto consiste
em um Frontend baseado em Angular e Backend em Spring Boot usando o padrão MVC para ser um sistema de consulta para tratamento de câncer de mama do SUS.

## Diagrama de entidades
![alt text](/assets/entidades.png?raw=true "Entidades")

## Diagrama de tabelas
![alt text](/assets/tabelas.png?raw=true "Entidades")

## Tecnologias 
Spring Boot, Spring Data, Spring JPA, API Rest, Angular, Angular Material, Node js, JavaScript, JSON e HTML

## Organização
- **Dia 8 - Inicio**:
     - Apresentação do projeto e encontro dos representantes da DIO e PHILIPS.
     - ----
     - Instalação do Intellij, Visual Studio, Angular CLI
     - Configuração importantes, dependencias e banco de dados.
- **Dia 9 - Backend**:
     - Iniciando com Spring Boot por meio do Spring Initializr com as dependencias:
        - Web.
        - JPA.
        - Driver MySQL.
        - Dev Tools.
        - jaxb-api(para ler aquivos xml, dependencia no maven).
     - Criado: 
        - arquivo properties.
        - Entidades.
        - Repositórios.
        - Controllers.
        - Mapeamentos.
     - Resultado: 
        - Requisições da API como findById, findAll, save e deleteById funcionaram corretamente.

- **Dia 10 - Frontend**:
     - Iniciando com Angular, usado:
        - Criação do projeto com Angular CLI.
        - Angular Material.
        - Estilo de tipografia
        - Tema.
        - Animações.
     - Criado: 
        - Modulo principal.
        - Componentes.
        - Redirecionamento simples.
     - Resultado:
        - Foi possivel entender a estrutura e o comportamento básico do Angular. Apesar de qase pronto, algumas coisas precisariam ser mudadas para a integração.
- **Dia 11 - Integração**:
     - Iniciado a integração
        - Criado os serviços responsáveis pelo redirecionamento no Frontend.
        - Proxys
        - HTML para visualização
        - Caminhos de serviço
        - Testes no Backend
     - Criado:
        - Serviços no Angular
        - Interfaces
        - Metodos no componente principal
     - Resultado:
        - Junto a criação das partes de Front e Back com integração, foi possivel ter o resultado experado e gratificante.
