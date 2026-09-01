package Bjavacorerevisao.teste;

import Bjavacorerevisao.dominio.Funcionario;

public class FuncionarioExercicio {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.nome = "Robertinho";
        funcionario1.idade = 26;
        //funcionario1.salario = new double []{};

        funcionario1.imprimir();

    }
}
