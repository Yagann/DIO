class RodarAplicacao {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Vermelho");
        carro1.setModelo("Voyage");
        carro1.setcapacidadeTanque(87);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getcapacidadeTanque());
        System.out.println(carro1.totalValorTanque(2));
        System.out.println("");

        Carro carro2 = new Carro("Cinza", "Fiat Uno", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getcapacidadeTanque());
        System.out.println(carro2.totalValorTanque(4.5));

    }
    
}