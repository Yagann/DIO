import java.util.Random;

import javax.swing.BoundedRangeModel;

public class NumerosAleatorios {
        public static void main(String[] args) {
            Random random = new Random();

            int[] numerosAleatorios = new int[20];
            
            for(int i = 0; i < numerosAleatorios.length; i++) {
                int numero = random.nextInt(100);

                numerosAleatorios[i] = numero;
            }

            System.out.print("\nNúmeros: ");
            for (int numero : numerosAleatorios) {
                System.out.print(numero + " ");
                
            }

            System.out.print("\nSucesores: ");
            for (int numero : numerosAleatorios) {
                System.out.print((numero+1) + " ");
                
            }

            System.out.print("\nAntecesores: ");
            for (int numero : numerosAleatorios) {
                System.out.print((numero-1) + " ");
                
            }
        
        
        }

}
