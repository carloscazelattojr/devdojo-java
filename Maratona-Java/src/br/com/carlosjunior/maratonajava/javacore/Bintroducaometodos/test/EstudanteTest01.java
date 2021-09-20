package br.com.carlosjunior.maratonajava.javacore.Bintroducaometodos.test;

import br.com.carlosjunior.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import br.com.carlosjunior.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Carlos Junior";
        estudante01.idade = 30;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria Zinha";
        estudante02.idade = 49;
        estudante02.sexo = 'F';

        estudante01.imprimir();
        estudante02.imprimir();

        //impressoraEstudante.imprimir(estudante01);
        //impressoraEstudante.imprimir(estudante02);



    }
}
