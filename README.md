# Best-Minds-2022

>_Neste desafio o candidato terá total liberdade de usar as ferramentas e linguagens que está mais familiarizado.
O objetivo principal será identificar sua criatividade e a capacidade de resolver um problema, principalmente o potencial de implementação,
qualidade de código, organização, boas práticas, conceitos de Clean Code, SOLID e preocupação com desenvolvimento para grandes volumes transacionais.
Você é responsável por desenvolver a solução, definir o modelo de entrega, utilizando-se das ferramentas de mercado atuais, bem como por pensar em
compartilhamento de código, versão de fontes etc. O desafio consiste em criar uma solução para atender um requisito de um projeto:
Nosso cliente fictício será a empresa Oliveira Trade e foi solicitado pelo board da empresa que seja desenvolvido uma forma de Sign in e Sign up de usuários.
Devemos permitir que seja criado um usuário no sistema, com os campos mínimos de cadastro normal para Pessoa Física. 
O usuário deve ser notificado que o cadastro foi concluído com sucesso e, a partir deste ponto, ser possível executar login. 
NÃO É MANDATÓRIO o desenvolvimento de uma interface front end, já que o board aceita como entrega - um serviço que possa ser consumido e executar 
as atividades requisitadas, desde que o desenvolvedor crie uma boa entrega com o manual de como utilizar o serviço. 
CONSIDERAÇÕES FINAIS: esperamos que consiga executar até o final, entretanto, mesmo que não consiga concluir totalmente, pedimos que entregue o que conseguir._<

# Escopo

O desafio foi desenvolvido utilizando as tecnologias
Spring Boot 3 e JDK 17. 
Utilizei o [Thymeleaf](https://www.thymeleaf.org/) para criar uma
interface visual simples para melhor visualização da aplicação.
Fiz o uso do banco de dados H2, que armazena os dados na
memória do navegador. Para mais informações [Acesse](https://www.h2database.com).

## Como rodar

### Pré-requisitos

`mvn --version`<br>
Você deve ter instalado em seu computador o JDK (Obrigatório) e também
a versão indicada do Maven.

`mvn spring-boot:run`<br>

Abra o projeto em sua IDE de preferência, baixe as dependências
e rode o comado de execução do Maven

Quando o programa executar, abra em seu navegador
o endereço _http://localhost:8080/ds_.
Você verá uma tela de login que não demanda
muitos detalhes.
