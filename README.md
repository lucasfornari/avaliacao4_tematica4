# Sistema de Empréstimo de Livros — Avaliação Final (Java)

Este repositório contém a implementação completa do **Sistema de Empréstimo de Livros**, desenvolvido como trabalho final da disciplina.  
O sistema foi construído em **Java**, baseado em interação via **console/terminal**, sem uso de bibliotecas externas além das permitidas.

--------------------------------------------------------------------

OBJETIVO DO SISTEMA

O sistema permite:
- Cadastro de livros
- Empréstimo de livros
- Devolução de livros
- Listagem de livros disponíveis
- Listagem de livros emprestados
- Organização automática dos livros por título (algoritmo Bubble Sort)

--------------------------------------------------------------------

ESTRUTURA UTILIZADA

O projeto segue uma arquitetura simples:

src/
├── App.java  
├── Livro.java  
├── Emprestimo.java  
└── ListaLivros.java  

**App.java**
- Contém o método *main*
- Gerencia o menu e entrada do usuário (Scanner)

**Livro.java**
Representa um livro com:
- Título
- Autor
- Ano de publicação

**Emprestimo.java**
Registra:
- Livro emprestado
- Usuário
- Data do empréstimo
- Data da devolução

**ListaLivros.java**
Gerencia:
- Lista de livros disponíveis
- Lista de livros emprestados
- Cadastro
- Empréstimo
- Devolução
- Ordenação (Bubble Sort)

--------------------------------------------------------------------

TECNOLOGIAS E FERRAMENTAS UTILIZADAS

- Java 17+
- VS Code
- Scanner
- ArrayList
- Sem frameworks externos

--------------------------------------------------------------------

ESTRUTURA DE DADOS

**ArrayList**

Justificativa:
- Simples para inserção e remoção
- Adequado para busca por título
- Ótimo para ordenação
- Estrutura dinâmica

--------------------------------------------------------------------

ALGORITMO DE ORDENAÇÃO

**Bubble Sort**

Funcionamento:
- Compara elementos adjacentes
- Troca quando necessário
- Repete até estar ordenado
- Didático e apropriado para fins acadêmicos

Aplicado em:
- Livros disponíveis
- Livros emprestados

--------------------------------------------------------------------

COMO EXECUTAR

Compilar:

    javac src/*.java -d bin

Executar:

    java -cp bin App

Ou executar diretamente pelo VS Code usando "Run".

--------------------------------------------------------------------

FUNCIONALIDADES

**Cadastro de livro**
- Título
- Autor
- Ano

**Empréstimo**
- Nome do usuário
- Data gerada automaticamente

**Devolução**
- Registra a data da devolução

**Listagem**
- Livros disponíveis
- Livros emprestados

**Ordenação**
- Automática em toda alteração de dados

--------------------------------------------------------------------

AUTOR

Trabalho acadêmico com foco em:
- Estruturas de dados
- Algoritmo de ordenação
- Programação orientada a objetos
- Aplicação via console