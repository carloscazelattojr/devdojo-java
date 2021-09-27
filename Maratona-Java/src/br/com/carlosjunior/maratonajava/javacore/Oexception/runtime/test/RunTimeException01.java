package br.com.carlosjunior.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeException01 {
    public static void main(String[] args) {
        //Checked and Unchecked
        try {

        Object obj = null;
        System.out.println(obj.toString());
        }catch (NullPointerException e){
            System.out.println("Erro: "+e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
