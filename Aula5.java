public class Aula5 {
    public static void main(String[] args) {

        /*
         * while (expressao boleana) {
         * ...
         * ...
         * ...
         * }
         * 
         * Enquanto a expressao boleana for true, faça ...
         */

        int counter = 0;
        while (counter < 50) {
            System.out.println(counter);
            counter++;
        }

        int counter2 = 0;
        while (counter2 < 10) {
            System.out.println("Strogonoff de pedra");
            counter2++;
        }
        System.out.println(counter2);

        int myCounter = 0;
        while (myCounter < 10) {
            myCounter++;

            if (myCounter == 5)
                continue;

            System.out.println(myCounter);
        }

        /*
         * do {
         * ...
         * } while (expressao boleana);
         */

        int counter3 = 10;
        do {
            System.out.println("Hello World");
        } while (counter3 < 10);

        /*
         * for (valor inicial; valor final; incremento) {
         * 
         * }
         */

        for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": To feliz!");
        }

        /*
         * "for-each"
         * for (tipo nomeVariavel : nomeDaArray) {
         * ...
         * }
         */

        int[] numeros = { 10, 20, 45, 6234, 2345, 2524, 0 };
        for (int numero : numeros) {
            System.out.println(numero);
        }

        String[] nomes = { "Jose", "Paulo", "Jailson", "Messi" };
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Exercicio: Somar os 100 primeiros numeros
        // While loop solution
        int contador1 = 0;
        int soma1 = 0;
        while (contador1 < 100) {
            soma1 += contador1;
            contador1++;
        }
        System.out.println(soma1);

        // For loop solution
        int soma2 = 0;
        for (int i = 0; i < 100; i++) {
            soma2 += i;
        }
        System.out.println(soma2);
    }
}
