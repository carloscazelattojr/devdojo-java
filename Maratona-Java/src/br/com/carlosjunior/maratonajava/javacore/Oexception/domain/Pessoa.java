package br.com.carlosjunior.maratonajava.javacore.Oexception.domain;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException{
        System.out.println("Salvando Pessoa!!!");
    }

}
