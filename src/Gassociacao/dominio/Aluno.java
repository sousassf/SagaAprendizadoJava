package Gassociacao.dominio;

public class Aluno {
    public String nome;
    public Curso curso;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(curso.getNome());
        if(curso.matricula != 6){
            return;
        }
        System.out.println(curso.getMatricula());
    }
}
