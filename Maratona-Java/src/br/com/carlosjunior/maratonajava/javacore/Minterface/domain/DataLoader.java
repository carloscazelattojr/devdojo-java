package br.com.carlosjunior.maratonajava.javacore.Minterface.domain;

public interface DataLoader {
    void load();
    default void checkPermission(){

    }

}
