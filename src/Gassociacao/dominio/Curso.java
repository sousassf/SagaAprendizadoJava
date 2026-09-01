package Gassociacao.dominio;

public class Curso {
    public String nome;
    public int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if(matricula != 6){
            return;
        }
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
