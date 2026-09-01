package Gassociacao.test;

import Gassociacao.dominio.Escola;
import Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {

        Professor professor = new Professor("Kakashi Sensei");
        Professor professor2 = new Professor("Tsunade Sensei");
        Professor professor3 = new Professor("Naruto Uchiha");
        Professor[] professores = {professor, professor2, professor3};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
