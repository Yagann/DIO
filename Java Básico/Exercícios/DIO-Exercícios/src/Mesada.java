import java.util.Scanner; 
    
public class Mesada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira a quantidade de mêses: ");
        int entrada = leitor.nextInt();
        int mesada = 50;
        
        int poupanca = (mesada * entrada);
        System.out.println("Em " + entrada + " mêses você já terá juntado: R$" + poupanca);
      
        // TODO: Crie a condição necessária para que o sobrinho saiba quanto dinheiro irá juntar nos meses da entrada
    }
     
}
