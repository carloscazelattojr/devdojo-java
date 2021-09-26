package br.com.carlosjunior.maratonajava.javacore.Minterface.domain;

public class FileLoader implements DataLoader{


    @Override
    public void load() {
        System.out.println("Carregando arquivo.");
    }

    @Override
    public void checkPermission() {
        System.out.println("Verificando permissão no arquivo");
    }
}
