public class User {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv  = new SmartTv();

        System.out.println("Canal sintonizado: " +smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Canal sintonizado: " +smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " +smartTv.volume);

        System.out.println("A Tv está ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " +smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status => A Tv está ligada? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo Status => A Tv está ligada? " + smartTv.ligada);

    }
}
