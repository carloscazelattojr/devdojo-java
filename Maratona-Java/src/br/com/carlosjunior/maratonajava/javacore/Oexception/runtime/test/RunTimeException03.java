package br.com.carlosjunior.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeException03 {
    public static void main(String[] args) {
        try {
            System.out.println("Abrindo arquivo ....");
            System.out.println("Escrevendo no arquivo ...");
            //throw new RuntimeException();
            //System.out.println("Fechando arquivo ...");
        }catch (Exception e){
            System.out.println("Passou pelo Catch");
           e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso - Finally");
        }
    }
}
