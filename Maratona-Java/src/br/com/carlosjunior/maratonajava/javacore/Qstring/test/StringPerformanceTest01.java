package br.com.carlosjunior.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        int tamanho = 10000;

        long inicio = System.currentTimeMillis();
        contatString(tamanho);
        long fim = System.currentTimeMillis();
        System.out.println("String: " + (fim - inicio));

        inicio = System.currentTimeMillis();
        contatStringBuilder(tamanho);
        fim = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (fim - inicio));

        inicio = System.currentTimeMillis();
        contatStringBuffer(tamanho);
        fim = System.currentTimeMillis();
        System.out.println("Stringbuffer: " + (fim - inicio));
    }

    private static void contatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void contatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void contatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
