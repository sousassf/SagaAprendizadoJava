package Bjavacorerevisao.teste;

import Bjavacorerevisao.dominio.Carro;

public class CarroExercicio {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.nome = "Hyundai";
        c1.modelo = "Hb20";
        c1.ano = 2013;

        c2.nome = "Honda";
        c2.modelo = "Civic g8";
        c2.ano = 2026;

        System.out.println("Carro 1 --- nome: " + c1.nome + " --- modelo: "+c1.modelo+" --- ano: "+c1.ano);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Carro 2 --- nome: " + c2.nome + " --- modelo: "+c2.modelo+" --- ano: "+c2.ano);
    }
}
