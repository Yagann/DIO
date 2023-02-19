# Programação Orientada a *Objetos*

 A Orientação a Objetos é um paradigma de análise, projeto e programação de sites de softwares baseado na composição e interação entre diversas unidades de softwares chamadas de *objetos*.



## Utilidade

###### PE x POO

**O Paradigma Estruturado**

- possui uma representação simples, conceitos e recursos mais limitados.
- foca em operações (funções) e dados "brutos".
- foca no *como* fazer



**O Paradigma Orientado a Objetos**

- possui uma representação bem mais realista e mecanismos avançados 
- foca na modelagem de entidades e facilita a interação entre elas.
- foca no *o que* fazer, *qual* o problema a ser resolvido, automatizando assim determinados processos.

------

#### Vantagens

- Coesão
- Melhor acoplamento
- Diminuição do Gap semântico
- Coletor de lixo



## Fundamentos

#### Pilares

A ***Abstração*** é o processo pelo qual se isolam *características essenciais* e conceituas de um objeto,  problema ou método, ignorando atributos e peculiaridades que os tornam únicos, e aplicando tais conhecimentos a outros setores afim de reusar o conteúdo absorvido. 

O ***Reuso*** é a capacidade de criar e utilizar novas unidades de código a partir de outras já existentes.

O ***Encapsulamento*** é a capacidade de esconder, separar, encapsular complexidades de certas áreas e proteger os dados, evitando assim acessos indevidos.



## Estrutura

A ***Classe*** é a unidade mínima e básica da codificação de programação. É uma estrutura que abstrai um conjunto de objetos com características similares. Uma classe define o comportamento de seus objetos através de métodos e os estados possíveis destes objetos através de atributos. Em outras palavras, a classe descreve os serviços providos por seus objetos e as informações que eles podem armazenar. 

A classe serve como um molde, servindo como base para criar o mundo real.

###### Dicas



O ***Atributo*** é o elemento de uma classe responsável por definir sua estrutura de dados. O conjunto destes será responsável por representar suas características e fará parte dos objetos criados a partir da classe. Serve para tornar mais palpável, sólido e consistente os conceitos do mundo real. 



*ATRIBUTO* x **VARIÁVEL**



###### Dicas



O ***Método*** é uma porção de códigos que é disponibilizada pela classe. É executado 



O ***Objeto*** é a representação de um conceito do mundo real, podendo ser física ou conceitual. Para essa entidade, deve ser definida 



A ***Mensagem*** é o processo de ativação de um método. É a solicitação que o método execute uma determinada requisição.



```java
Carro carro = new Carro();
carro.<método>;

Carro.<método>;

//Exemplo real
Scanner scan = new scan(System.in);
```



## Relações

### Herança

```java
class A extends B {

}
```

#### Tipos

*Simples*

A classe filha tem apenas uma classe mãe.



*Múltipla*

A classe filha possui duas ou mais mães.

#### Upcast e *Downcast*

Upcast

`A a = new B();`



Downcast

`B a = (B)new A();`



#### *Polimorfismo* x Sobrescrita

O ***Polimorfismo*** é a mesma ação ***sempre comportando de forma diferente***, o *mesmo método* realizando a mesma função de *forma diferente*. Já a **Sobrescrita** é a mesma ação **podendo ser realizada de forma diferente**, acrescentando assim mais informação a função, não necessariamente se comportando assim.



### Associação

Possibilita um relacionamento entre classe e objetos, no qual possam pedir auxílio a outra classe ou objeto e representar de forma completa o conceito ao qual se destinam. Neste tipo de relação, as classes e objetos interagem entre si para atingir seus objetivos e funções com um melhor desempenho.

#### Tipos de Associação

Estrutural

- Composição

Com parte todo, 

```java
class Pessoa {
	Endereco endereco();
}
```





- Agregação

```java
class Disciplina {
	Aluno aluno;
}
```



Comportamental

- Dependência

Depende de...



```java
class Compa {
    ...
    finalizar(Cupom cupon, ...){
        ...
    }
    
}
```



###### Herança x Associação



### Interface

Define um contrato que deve ser seguido pela classe que o implementa. Quando uma classe implementa uma interface, ela se compromete a realizar todos os comportamentos que a interface disponibiliza. 



```java
interface  A {
    
}

class B implements A {
    
}
```





## Organização

### Pacotes

São uma organização física ou lógica criada para separar classes com responsabilidades. Com isso, espera-se que a aplicação fique mais organizada e seja possível separas



```java
//Exemplo
package one.digitalinovation.oo;

import Java scanner;
```



### Visibilidades



```java
//Privado
private
    
private int i;

private void do();

//Protegido
protected

protected int i;
protected void do();

//Public
public

public int i;
public void do();
```



## Next Stage

