package Hheranca.test;

import Hheranca.dominio.Endereco;
import Hheranca.dominio.Funcionario;
import Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Rogerin");
        pessoa.setCpf("08309266588");
        Endereco endereco = new Endereco();
        endereco.setCep("49001320");
        endereco.setRua("Rua J");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("---------------");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Cleitin");
        funcionario.setCpf("02422589588");
        Endereco endereco2 = new Endereco();
        endereco2.setRua("Rua T");
        endereco2.setCep("49002240");
        funcionario.setEndereco(endereco2);
        funcionario.setSalario(20000);
        funcionario.imprime();

    }
}
