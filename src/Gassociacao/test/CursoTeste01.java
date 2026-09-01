package Gassociacao.test;

import Gassociacao.dominio.Aluno;
import Gassociacao.dominio.Curso;

public class CursoTeste01 {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.nome = "ADS";
        curso.setMatricula(6);

        Aluno a1 = new Aluno();
        a1.nome = "Lucas";
        a1.curso = curso;



        a1.imprime();
    }
}
