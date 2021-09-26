package br.com.carlosjunior.maratonajava.javacore.Minterface.domain;

public class DataBaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados!!!");
    }

    @Override
    public void remove() {
        System.out.println("Removendo ......");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões Banco de Dados");
    }
}
