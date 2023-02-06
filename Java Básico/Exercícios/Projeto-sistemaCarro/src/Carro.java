public class Carro {
    boolean ligado = false;
    int velocidade = 0;
    
    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;

    }

    public void mudarVelocidade (int novaVelocidade){
        velocidade = novaVelocidade;
    }

    public void diminuirVelocidade (){
        velocidade--;
        System.out.println("Diminuindo a velocidade para: " + velocidade);

    }

    public void aumentarVelocidade(){
        velocidade++;
        System.out.println("Aumentando a velocidade para: " + velocidade);

    }

}
