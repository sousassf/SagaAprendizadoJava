package Kenum.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipocliente;
    private TipoPagamento tipopagamento;


    public Cliente(String nome, TipoCliente tipocliente, TipoPagamento tipopagamento){
        this.nome = nome;
        this.tipocliente = tipocliente;
        this.tipopagamento = tipopagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome= " + nome + '\'' +
                ", tipocliente= " + tipocliente.getNomeRelatorio() +
                ", tipoclienteInt= " + tipocliente.getValor() +
                ", tipopagamento= " + tipopagamento +
                '}';
    }
}
