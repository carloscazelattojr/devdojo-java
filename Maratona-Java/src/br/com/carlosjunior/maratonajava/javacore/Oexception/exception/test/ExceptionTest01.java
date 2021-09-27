package br.com.carlosjunior.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File arquivo = new File("D:\\projetos\\DevDojo\\Maratona-Java\\arquivo\\teste.txt");
        try {
            boolean isCriado = arquivo.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        } catch (IOException err) {
            System.out.println("ERRO: ");
            err.printStackTrace();
        }
    }

}
