package br.com.carlosjunior.maratonajava.javacore.Oexception.exception.test;

import br.com.carlosjunior.maratonajava.javacore.Oexception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {

    public static void main(String[] args) {
        try {
            logar();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }

    }

    private static void logar() throws LoginInvalidoException{

        Scanner teclado = new Scanner(System.in);
        String username = "GOKU";
        String senha ="SSJ";

        System.out.println("Usuario: ");
        String userNameDigitado = teclado.nextLine();

        System.out.println("Senha: ");
        String senhaDigitado = teclado.nextLine();

        if (!username.equals(userNameDigitado) || !senha.equals(senhaDigitado)){
            throw new LoginInvalidoException("Usuario Errado porra!!!");
        }


    }

}
