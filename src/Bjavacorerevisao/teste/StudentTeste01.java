package Bjavacorerevisao.teste;

import Bjavacorerevisao.dominio.Student;
import Bjavacorerevisao.dominio.impressoraEstudante;

public class StudentTeste01 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        impressoraEstudante impressora = new impressoraEstudante();

        stu1.nome = "Midorya";
        stu1.idade = 21;
        stu1.sexo = 'M';

        stu2.nome = "Sakura";
        stu2.idade = 32;
        stu2.sexo = 'F';

        System.out.println(stu1.nome);
        System.out.println(stu1.idade);
        System.out.println(stu1.sexo);

        System.out.println("---------------------");

        System.out.println(stu2.nome);
        System.out.println(stu2.idade);
        System.out.println(stu2.sexo);

        impressora.imprime(stu1);
        impressora.imprime(stu2);

        System.out.println("################################");

        impressora.imprime(stu1);
        impressora.imprime(stu2);

        System.out.println("################################");

        stu1.imprime();
        stu2.imprime();


    }
}
