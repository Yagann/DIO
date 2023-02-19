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

É a capacidade de definir métodos para diferentes conceitos, mas preservando seu nome. Para que isso aconteça, devemos mudar sua lista de parâmetros.



###### Criação

Alterar a assinatura do métod:

**Ass = nome + parâmetros**

```java
converterParaInteiro(float f);
converterParaInteiro(double d);
converterParaInteiro(String s);
converterParaInteiro(float f, RoundType rd);
converterParaInteiro(double d, RoundType rd);
converterParaInteiro(String s, RoundType rd);

converterParaInteiro(RoundType rd, String s);
converterParaInteiro();
```

Maior exemplo de sobrecarga

```Java
System.out.println("Tudo eu. Sempre eu.")
```



#### Sobrecarga X *Sobrescrita*

Embora ambos atuem sobre os métodos podendo usá-los e subvertê-los, o modo como se comportam e são feitos é extremamente diferente. Enquanto a *sobrecarga* muda-se apenas a *lista de parâmetros* do método, a ***sobrescrita*** está ligada com a Orientação a Objetos, ***alterando*** assim o ***conceito de herança*** de um método.  



------

### Retorno

Assim como os o *break* e o *continue*, o "return" também é uma *instrução de interrupção*. Enquanto os dois exemplos anteriores estejam relacionados a loops, o return é comumente *usado em métodos*.



O método executa sua função quando:

- Completa todas as instruções internas
- Recebe uma declaração explicita requisitando o retorno
- Lança uma exceção



###### Observações

- O **tipo de retorno do método é definido na criação** e pode ser um tipo primitivo ou objeto
- **O tipo de dado** do return **deve ser compatível com o do método**
- Se o método for sem retorno (*void*), pode ou não ter "return" para encerrar sua execução



Exemplos

```java
//Compatíveis
public String getMensagem(){
    return "Olá!";
}

public double getJuros(){
    return 2.36;
}

//Não Compatíveis
public int getParcelas(){
    return 1.36f;
}

public void setIdade(){
    return 10;
}
```

