package br.com.carlosjunior.maratonajava.javacore.Npolimorfismo.test;

import br.com.carlosjunior.maratonajava.javacore.Npolimorfismo.domain.Computador;
import br.com.carlosjunior.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import br.com.carlosjunior.maratonajava.javacore.Npolimorfismo.service.CalculadoraImpostoService;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador comp = new Computador("DELL I3", 1800.0);
        Tomate tom = new Tomate("Tomate rasteiro", 7.0);
        CalculadoraImpostoService.calcularImpostoComputador(comp);
        System.out.println("----------");
        CalculadoraImpostoService.calcularImpostoTomate(tom);
    }
}
