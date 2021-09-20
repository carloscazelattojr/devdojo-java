package br.com.carlosjunior.maratonajava.javacore.Bintroducaometodos.test;

import br.com.carlosjunior.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.nome="Carlos";
        func.idade = 30;
        //func.salarios = new double[]{1200,935.58,2579.36} ;

        func.imprimir();

    }

}
