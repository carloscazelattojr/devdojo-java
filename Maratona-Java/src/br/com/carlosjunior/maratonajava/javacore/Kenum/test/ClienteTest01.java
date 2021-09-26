package br.com.carlosjunior.maratonajava.javacore.Kenum.test;

import br.com.carlosjunior.maratonajava.javacore.Kenum.domain.Cliente;
import br.com.carlosjunior.maratonajava.javacore.Kenum.domain.TipoCliente;
import br.com.carlosjunior.maratonajava.javacore.Kenum.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Carlos", TipoCliente.PESSOA_FISICA);
        Cliente cliente02 = new Cliente("Carlos", TipoCliente.PESSOA_JURIDICA);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
