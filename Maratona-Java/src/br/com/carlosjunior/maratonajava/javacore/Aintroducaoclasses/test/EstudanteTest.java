package br.com.carlosjunior.maratonajava.javacore.Aintroducaoclasses.test;

import br.com.carlosjunior.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();

        estudante1.sexo = 'M';
        estudante1.idade = 30;
        estudante1.nome = "Carlos Junior";

        System.out.println("Nome: "+estudante1.nome);
        System.out.println("Idade: "+estudante1.idade);
        System.out.println("Sexo: "+estudante1.sexo);
        //System.out.println("Sexo: "+estudante1 );

    }
}
