# Java

Java Básico foi desenvolvido para ser uma linguagem simples, pois foi projetado para funcionar em hardwares e lugares onde menos recursos estão disponíveis

*Tudo no Java são **Objetos***. A linguagem Java é orientada a *Objestos*, onde tudo é escrito em Classe e Objeto. Para começar a operar na linguagem, é necessário compreender os pilares da *Programação Orientada a Objetos* (POO), que são:

- Classe e Objeto

- Encapsulamento

- Abstração

- Herança

- Polimorfismo

é composto pelas *features*

- Object Orlented
- Simple
- 



WOR(Write Once Run Anywhere) JVM e bytecode



Robusta

coleta de lixo automática



Seguro







Fundamentos



IDE(Ambiente Integrado de Desenvolvimento)

Principais Objetivos

## História

Em 1991 a Sun Microsystem financiou uma pesquisa interna com o codinome Green, que resultou no desenvolvimento  de uma linguagem baseada em C e C++, onde o criado James Gosling batizou de Oak(carvalho) em homenagem à planta que crescia na janela de seu escritório. 











Os arquivos na linguagem Java são arquivos de texto que possuem a extensão ".java", podendo assim serem desenvolvidos em qualquer editor de texto. No entanto, ao realizar este processo, perderíamos todos os atalhos e auxílio que o Java possui. Para contornar isso, foram desenvolvidas as **IDE** (*Integrated Development Environment*)



## Anatomia de Classe

- Estrutura inicial
- Padrão de nomenclatura

- ### Declarando variáveis

*Estrutura*

Tipo NomeBemDefinido = Atribuição

#### Declarando métodos

TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)



- Identação

- Organizando arquivos

- Java Bean





### Tipos e Variáveis

#### Assuntos

- Números inteiros



byte - 1 byte =

short - 1 byte =

int - 1 byte =

long - 1 byte =



float - 4 byte =

double - 8 byte =



- Tipos lógicos

- Caracteres

- Objetos

- Diferença entre variável e constante

Constantes são valores, tipados em caixa alta, que não podem ser alterados.



//estudar tipos primitivos

//estudar o tipo String



## Operadores

Operadores são símbolos especiais que possuem um significado próprio para a linguagem e estão ligados a determinadas operações

- Operadores aritméticos

São utilizados para realizar operações matemáticas entre valores numéricos, podendo se tornar ou não uma equação complexa.

Os operadores aritméticos são "+" (adição); "-" (subtração); "*" (multiplicação); e "/" (divisão).



- Operadores unários

São operadores aplicados junto com outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.



- **(+) Operador unário**

Operador unário

Operador unário

Operador unário

Operador unário

Operador unário

- Operador ternário

definir uma condição e escolher por um entre dois valores



<Expressão condicional> ? <Caso condição seja *true*> : <Caso condição seja *false*>

A **lógica** aplicada a este operador é a **booleana**, isto é, os valores de resposta *só podem ser false ou true, 0 ou 1, verdadeiro ou falso, sim ou não, aprovado ou retido*







- Operadores relacionais

Avaliam a relação entre duas variáveis ou expressões, indo da esquerda para a direita, considerando se os valores são iguais, ou não, e retornando um **resultado booleano**

== igual

!= diferente

< menor

">" maior

 <= menor igual

">=" maior igual



".equals"

Compara textos, conteúdos.



- Operadores lógicos

Representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões



&&

||



## Métodos



- Deve ser nomeado como verbo.
- Seguir o padrão camelCase





### Escopo

o ambiente onde uma variável pode ser acessada

Escopo de classe

Escopo de método

Escopo de fluxo





### Palavras Reservadas

São identificadores de uma linguagem com uma finalidade bem definida, portanto, não podem ser usados para nomear variáveis, classes, métodos ou atributos.  A linguagem Java possui 52 palavras reservadas. Todas essas palavras são classificadas em classe e **são escritas em minúsculo**, sendo *identificadas por uma cor específica* pela maioria das IDE's.



Controle de pacote

**import**: importa pacotes ou classes para dentro do código

**package**: especifica a que pacote todas as classes de um arquivo pertencem/se direcionam



Modificadores de 

**public**: acesso de qualquer classe. (Deixa a classe, atributo e método público)

**private**: acesso apenas dentro da classe. (Deixa as informações *apenas a nível de classe*)

**protected**: acesso por classes no mesmo pacote e subclasses. (Só é trabalhada com o *uso/concepção de herança*)



Primitivos

boolean:

byte:

char:

double:

int

long

short

void



Modificadores de classes, variáveis ou métodos

**extends**

**final**







**implements**

**native**

**new**

**static**

**strictfp**

**synchronized**

**transient**: impede a serialização de campos.

**volatile**



Controle de fluxo dentro de um bloco de código

**break**

**case**

**continue**



Palavras opostas

package X import

extends X implements

final X abstract

throws X throw











### Terminal e Argumentos

Argumentos principais - main args

Scanner

Execução via IDE

Execução via prompt de comando



Com a JVM devidamente configurada, podemos criar um executável do nosso programa e disponibilizar o instalados para qualquer OS.
