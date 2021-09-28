package br.com.carlosjunior.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException {
        File arquivo = new File("D:\\projetos\\DevDojo\\Maratona-Java\\arquivo\\teste.txt");
        boolean isCriado = arquivo.createNewFile();
        System.out.println("Arquivo criado: " + isCriado);
    }

}
