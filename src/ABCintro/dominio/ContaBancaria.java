package ABCintro.dominio;
import java.util.ArrayList;
import java.util.List;

public class ContaBancaria{
    public String titular;
    public double saldo;
    public List<Double> transacoes = new ArrayList<>();


    public void depositar(double num){
        this.saldo +=  num;
        this.transacoes.add(num);
    }

    public void sacar(double num){
        this.saldo -= num;
        this.transacoes.add(-num);
    }

    public void extrato(){
        System.out.println("--------------------------------------");
        System.out.println("--------------- EXTRATO --------------");
        System.out.println("--------------------------------------");
        System.out.println("");
        System.out.println("Titular: "+ this.titular);
        System.out.println("Saldo: "+ this.saldo);
        System.out.println("Transações: "+ this.transacoes);
        System.out.println("");
        System.out.println("---------------------------------------");

    }
}

