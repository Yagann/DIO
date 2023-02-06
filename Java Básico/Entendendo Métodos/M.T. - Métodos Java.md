# Entendendo Métodos Java

**Métodos** são uma *porção de códigos disponibilizados* por uma ***classe***. É executado quando é feita uma requisição dele e *são responsáveis por **definir e realizar** um determinado **comportamento.***

"**Tudo** o que quisermos que aconteça estará *dentro de um **método***."  

------

### Criação

Padrão de definição

*<'Visibilidade'> <'Tipo'> <'Modificador'> **Retorno Nome (**<'Parâmetros'>**)** <'Exceções'> **Corpo***



*V*: "pubic", "protected" ou "private"

*T*: concreto ou abstrato

*M*: "static" ou "final"

**R**: tipo de dado ou "void"

**N**: nome que é fornecido ao método

*P*: parâmetros que pode receber

*E*: exceções que pode lançar

**C**: código que possui ou vazio



Exemplos



```
public String getNome(){

}

public double calcularTotalNota() {

}

public int verificarDistancia(int cordenada1,int cordenada2){

}

public abstract void executar();

public void alterarFabricante(Fabricante fabricante){

}

public Relatorio gerarDadosAnaliticos(Cliente cliente)

List<'Compra'> compras {}
```



#### Norma padrão do curso

```
public static R N(P){
}
```



#### Utilização

###### Chamando método via *Classe*

"nome_da_classe"**.**"nome_do_método"**();**

"nome_da_classe"**.**"nome_do_método"**(**"parâmetros"**);**

Math.random();

Math.sqrt(4);



###### Chamando método via *Objeto*

"nome_do_objeto"**.**"nome_do_método"**();**

"nome_da_classe"**.**"nome_do_método"**(**"parâmetros"**);**

usuario.getEmail();

usuario.alterarEndereco(endereco);



#### Particularidades

Assinatura é a forma de identificar unicamente o método

Ass = **nome** + *parâmetro*



Método

public double calcularTotalVenda(double precoItem1, double precoItem2){

}



Assinatura

**calcularTotalVenda** + *(double precoItem1, precoItem2 ){*

*}*



**Construtor e Destrutor** são métodos especiais usados na *Orientação a Objetos*. O Construtor cria objetos, e o Destrutor auxilia na destruição dos métodos.

**Mensagem** é o ato de solicitar ao método que execute sua função, que pode ser direcionada a um objeto ou classe.



Passagem de parâmetros por

- valor(cópia)

```java
int i=10;
public void fazerAlgo(int i){
	i = i + 10;
	System.out.println("Valor de i dentro: " + i);
}
System.out.println("Valor de i fora: " + i);
```



- referência(endereço)





#### *Dicas*





------

### Sobrecarga



------

### Retorno



