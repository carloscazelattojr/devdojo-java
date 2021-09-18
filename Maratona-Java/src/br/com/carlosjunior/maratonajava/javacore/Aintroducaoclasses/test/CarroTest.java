package br.com.carlosjunior.maratonajava.javacore.Aintroducaoclasses.test;

import br.com.carlosjunior.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome="Fusca Bala";
        carro1.ano = 1969;
        carro1.modelo = "XL";
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("------------------\n");
        Carro carro2 = new Carro();
        carro2.nome="GOL";
        carro2.ano = 2020;
        carro2.modelo = "GSTI";

        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

    }
}
