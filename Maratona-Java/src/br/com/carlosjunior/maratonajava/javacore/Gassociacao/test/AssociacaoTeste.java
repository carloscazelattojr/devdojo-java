package br.com.carlosjunior.maratonajava.javacore.Gassociacao.test;

import br.com.carlosjunior.maratonajava.javacore.Gassociacao.dominio.Aluno;
import br.com.carlosjunior.maratonajava.javacore.Gassociacao.dominio.Local;
import br.com.carlosjunior.maratonajava.javacore.Gassociacao.dominio.Professor;
import br.com.carlosjunior.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua da Universade");
        Aluno aluno = new Aluno("Carlos junior", 20);
        Aluno aluno2 = new Aluno("Mateus", 3);
        Professor professor = new Professor("Prof. Xavier", "Mutante");

        Aluno[] alunosParaSeminario = {aluno, aluno2};
        Seminario seminario = new Seminario("Como ser X-Men", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprimir();

    }
}
