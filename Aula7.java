import java.util.Random;

public class Aula7 {
    public static void main(String[] args) {
        /*
         * Packages
         * 
         * Basicamente, um conjunto de classes que nos ajudam a escrever nossos
         * programas.
         * 
         * Alguns deles são pacotes integrados, fornecidos pelo Java SDK
         * - java.lang (automaticamente importado)
         * - java.io
         * - java.math
         * - java.text
         * - java.util
         * 
         * Existem duas maneiras de importar um package no seu codigo:
         * 1 - Explicitamente: import java.util.Random;
         * 2 - Wildcard: import java.util.*;
         */

        /*
         * Random
         * 
         * import java.util.Random;
         * 
         * nextInt() - Gera um int aleatorio
         * nextInt(n) - Gera um numero aleatorio entre 0 e (n - 1)
         * nextDouble() - Gera um double aleatorio entre 0.0 e 1.0
         */

        Random rand = new Random();
        System.out.println("nextInt()      : " + rand.nextInt());
        System.out.println("nextInt(10)    : " + rand.nextInt(10));
        System.out.println("nextDouble()   : " + rand.nextDouble());
        System.out.println("nextDouble * 10: " + rand.nextDouble() * 10 + "\n");

        /*
         * Math
         * 
         * java.lang (automaticamente importado)
         * 
         * pow(double x, double y) - eleva o numero x ao numero y
         * sqrt(double x) - retorna a raiz quadrada do numero x
         * min(int x, int y) - retorna o numero menor entre x e y
         * max(int x, int y) - retorna o numero maior entre x e y
         * abs(int x) - retorna o absoluto do numero x
         */

        System.out.println("Pow : " + Math.pow(10, 2));
        System.out.println("Sqrt: " + Math.sqrt(121));
        System.out.println("Min : " + Math.min(10, -5));
        System.out.println("Max : " + Math.max(10, -5));
        System.out.println("Abs : " + Math.abs(-100));
    }
}
