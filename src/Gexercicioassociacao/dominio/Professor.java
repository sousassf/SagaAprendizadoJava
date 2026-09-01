package Gexercicioassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Especialidade: "+this.especialidade);
        if(seminarios == null) return;
        System.out.println("Seminários Ministrados: ");
        for(Seminario seminario : seminarios){
            System.out.println("  - "+ seminario.getTitulo());
        }
    }


    //getter and setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public String getEspecialidade(){
        return this.especialidade;
    }
}
