package br.com.carlosjunior.maratonajava.javacore.Oexception.exception.test;

import br.com.carlosjunior.maratonajava.javacore.Oexception.domain.Funcionario;
import br.com.carlosjunior.maratonajava.javacore.Oexception.domain.LoginInvalidoException;
import br.com.carlosjunior.maratonajava.javacore.Oexception.domain.Pessoa;

public class SobrescritaExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }
}
