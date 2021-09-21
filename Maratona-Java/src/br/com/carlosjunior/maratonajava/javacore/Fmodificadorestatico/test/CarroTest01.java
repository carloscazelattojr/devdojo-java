package br.com.carlosjunior.maratonajava.javacore.Fmodificadorestatico.test;

import br.com.carlosjunior.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Lamborguini", 300);
        Carro c3 = new Carro("Mercedes", 250);


        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
