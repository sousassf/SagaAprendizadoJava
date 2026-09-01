package Fmodificadorestatico.test;

import Fmodificadorestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[]args) {
        Carro c1 = new Carro("Mustang", 350);
        Carro c2 = new Carro("Audi TT", 270);
        Carro c3 = new Carro("Ferrari 488", 300);

        System.out.println(Carro.getVelocidadeLimite());
        Carro.setVelocidadeLimite(280);
        System.out.println(Carro.getVelocidadeLimite());

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
