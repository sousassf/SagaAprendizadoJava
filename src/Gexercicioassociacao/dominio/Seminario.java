package Gexercicioassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario(String titulo){
        this.titulo = titulo;

    }

    public void imprime(){
        System.out.println("--- Seminário de "+this.titulo+" ---");
        imprimeProfessor();
        imprimeLocal();
        imprimeListaDeAlunos();
    }

    public void imprimeListaDeAlunos(){
        //nome e idade nesse metodo
        if(alunos != null){
            int cont = 1;
            System.out.println("Lista de alunos:");
            for(Aluno aluno : alunos){
                System.out.println(cont+") "+aluno.getNome()+" - "+aluno.getIdade() + " anos");
                cont++;
            }
        }
    }

    public void imprimeProfessor(){
        if(professor == null) return;
        System.out.println("Avaliador: "+ professor.getNome());
        System.out.println("  - Especialidade: " + professor.getEspecialidade());
    }

    public void imprimeLocal(){
        if(local == null) return;
        System.out.println("Local: "+ local.getEndereco());
    }


    //getter and setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
