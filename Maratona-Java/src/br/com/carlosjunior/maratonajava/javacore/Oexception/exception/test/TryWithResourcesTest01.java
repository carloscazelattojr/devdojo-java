package br.com.carlosjunior.maratonajava.javacore.Oexception.exception.test;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo2();
    }

    public static void lerArquivo(){
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader(("teste.txt")));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void lerArquivo2(){
        try(Reader reader = new BufferedReader(new FileReader(("teste.txt")))){

        }catch (IOException e){

        }
    }

}
