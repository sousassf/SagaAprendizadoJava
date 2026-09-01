package Bjavacorerevisao.teste;

import Bjavacorerevisao.dominio.ModificadoresDeAcesso;

public class MDATeste01 {
    public static void main(String[] args) {
        ModificadoresDeAcesso mda = new ModificadoresDeAcesso();
        mda.setNome("Gustavin");
        mda.setIdade(126);
        mda.imprime();
        System.out.println("----------");
        System.out.println(mda.getNome());
        System.out.println(mda.getIdade());

    }
}
