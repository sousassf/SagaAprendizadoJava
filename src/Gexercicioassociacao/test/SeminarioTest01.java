package Gexercicioassociacao.test;

import Gexercicioassociacao.dominio.Aluno;
import Gexercicioassociacao.dominio.Local;
import Gexercicioassociacao.dominio.Professor;
import Gexercicioassociacao.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Seminario seminario = new Seminario("Lógica de Programação");
        Professor professor = new Professor("Professor Paulo", "Banco de Dados");
        Local local = new Local("Sala 07");
        Aluno aluno1 = new Aluno("Robertinho", 18);
        Aluno aluno2 = new Aluno("Carlinhos", 17);
        Aluno aluno3 = new Aluno("Fernandinho", 19);

        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);

        Aluno[] alunos = {aluno1, aluno2, aluno3};
        seminario.setAlunos(alunos);

        seminario.setProfessor(professor);

        seminario.setLocal(local);

        seminario.imprime();
        System.out.println("----");
        professor.imprime();
    }
}
