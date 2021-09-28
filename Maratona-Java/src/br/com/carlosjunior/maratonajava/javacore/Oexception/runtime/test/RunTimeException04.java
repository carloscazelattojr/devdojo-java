package br.com.carlosjunior.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeException04 {
    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: ArrayIndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Erro: IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Erro: ArithmeticException");
        } catch (Exception e){
            System.out.println("Erro: Exception");
        }
    }
}
