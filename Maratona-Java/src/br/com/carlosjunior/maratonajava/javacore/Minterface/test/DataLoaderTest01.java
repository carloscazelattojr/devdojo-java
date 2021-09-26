package br.com.carlosjunior.maratonajava.javacore.Minterface.test;

import br.com.carlosjunior.maratonajava.javacore.Minterface.domain.DataBaseLoader;
import br.com.carlosjunior.maratonajava.javacore.Minterface.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dbl= new DataBaseLoader();
        FileLoader fl = new FileLoader();
        dbl.load();
        dbl.remove();
        fl.load();
        fl.checkPermission();
        dbl.checkPermission();
    }
}

