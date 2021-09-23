package br.com.carlosjunior.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void imprimir() {
        System.out.println("---------------");
        System.out.println("Professor: " + nome);

        if (this.seminarios == null)
            return;
        System.out.println();
        System.out.println("## Seminários Cadastrados ##");
        for (Seminario sem : this.seminarios) {
            System.out.println("Seminário: " + sem.getTitulo());
            System.out.println("Local: " + sem.getLocal().getEndereco());
            System.out.println();
            if (sem.getAlunos() == null || sem.getAlunos().length == 0)
                continue;

            System.out.println("** Alunos **");
            for (Aluno a : sem.getAlunos()) {
                System.out.println("Aluno: " + a.getNome() + " Idade: " + a.getIdade());
            }
        }

    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


}
