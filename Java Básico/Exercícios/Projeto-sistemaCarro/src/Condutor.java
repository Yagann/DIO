public class Condutor {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro();

        carro.desligar ();
        System.out.println("Novo Status => O carro está ligado? " + carro.ligado);

        carro.ligar ();
        System.out.println("Novo Status => O carro está ligado? " + carro.ligado);

        System.out.println("Status Atual = " + carro.ligado);

        carro.mudarVelocidade(150);
        System.out.println("Velocidade alterada para: " + carro.velocidade);

        carro.diminuirVelocidade();
        carro.diminuirVelocidade();
        carro.diminuirVelocidade();
        System.out.println("Velocidade alterada para: " + carro.velocidade);

        System.out.println("O carro está ligado? " + carro.ligado);
        System.out.println("Velocidade Atual: " + carro.velocidade);

        carro.mudarVelocidade(240);
        System.out.println("Velocidade alterada para: " + carro.velocidade);

        System.out.println("Velocidade Atual: " + carro.velocidade);

    }
}