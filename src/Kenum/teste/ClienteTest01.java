package Kenum.teste;

import Kenum.dominio.Cliente;
import Kenum.dominio.TipoCliente;
import Kenum.dominio.TipoPagamento;


public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("José", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Carlos", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);


        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(800));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(800));

    }
}
