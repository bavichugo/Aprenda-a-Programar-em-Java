import java.util.Scanner;

public class Aula6 {
    public static void main(String[] args) {
        /*
         * Strings sao objetos
         * Strings sao imutáveis
         * Elas armazenam uma referência ao objeto em vez do próprio objeto.
         */

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println("s1: " + s1);
        System.out.println("s3: " + s3);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        /*
         * Nos podemos chamar metodos em Objetos
         */

        System.out.println(s1.equals(s3));
        System.out.println(s1.length());
        System.out.println(s1.charAt(5));

        /*
         * Concatenação de Strings
         */

        String s4 = "O sapo";
        s4 += " come strogonoff";
        System.out.println(s4);
        s4 = s4.concat(" de pedra");
        System.out.println(s4);

        /*
         * Printing
         */

        System.out.print("Ola eu sou a peppa pig");
        System.out.println(", e eu sou o marcao");

        System.out.println("Como um grande famosos disse: ");
        System.out.println("Eu sou uma foca aqui o");

        /*
         * Escape Sequences
         * \n - nova linha
         * \t - tab
         * \" - "
         * \\ - \
         */

        System.out.print("Ola eu sou a peppa pig\n"); // Vira basicamente um .println()
        System.out.println("Vai ter um espaco\t aqui no meio");
        System.out.println("Usando um backslash aqui: \\");
        System.out.println("\"Nada se cria, tudo se copia\"");

        /*
         * Printf
         * Uma maneira diferente de formatar seus print statements
         * %s - String
         * %d - decimal integers
         * %f - floating point numbers
         * %n - \n
         */

        String nome = "Hasbulla";
        int idade = 18;
        System.out.printf("O meu nome e %s e eu tenho %d anos%n", nome, idade);
        // System.out.println("O meu nome e " + nome + " e eu tenho " + idade + "anos");

        double pi = 3.14159;
        System.out.printf("Numero pi: %f%n", pi);
        System.out.printf("Numero pi: %.2f%n", pi);

        /*
         * Scanner - usado para user input
         * import java.util.Scanner;
         */

        Scanner scan = new Scanner(System.in);
        String seuNome;
        int suaIdade;
        double suaAltura;

        System.out.print("Digite o seu nome: ");
        seuNome = scan.nextLine();

        System.out.print("Digite sua idade: "); // Mostrar o caso onde o nextInt vem primeiro
        suaIdade = scan.nextInt();
        scan.nextLine();

        System.out.print("Digite sua altura: ");
        suaAltura = scan.nextDouble();
        scan.nextLine();

        System.out.printf("Seu nome: %s, Sua idade: %d, Sua altura: %.2f", seuNome, suaIdade, suaAltura);
    }
}
