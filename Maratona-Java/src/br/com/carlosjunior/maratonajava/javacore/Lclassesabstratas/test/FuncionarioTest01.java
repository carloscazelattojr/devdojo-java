package br.com.carlosjunior.maratonajava.javacore.Lclassesabstratas.test;

import br.com.carlosjunior.maratonajava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import br.com.carlosjunior.maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Junior", 2950.0);
        System.out.println(gerente);

        Desenvolvedor dev = new Desenvolvedor("Carlos", 15985);
        System.out.println(dev);
    }
}
