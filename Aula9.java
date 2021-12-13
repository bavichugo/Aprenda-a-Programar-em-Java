public class Aula9 {
    public static void main(String[] args) {
        /*
         * Métodos
         * 1 - Métodos fornecem uma maneira conveniente de se reutilizar codigo.
         * 2 - Dividindo nossos programas em pedaços menores que podem ser
         * compartilhados ou usados ​​dentro de uma classe torna nossos programas mais
         * fáceis de ler, escrever e debugar.
         */

        /*
         * Métodos Static
         * Nos permite criar métodos que podem ser chamados sem criar uma
         * instância da classe - semelhante a como podemos chamar Math.pow() sem criar
         * um Math object primeiro.
         */

        /*
         * Sem Utilizar métodos
         */
        int total1 = 0;
        for (int i = 0; i <= 5; i++) {
            total1 += i;
        }
        System.out.println("Total1: " + total1);

        int total2 = 0;
        for (int i = 0; i <= 9; i++) {
            total2 += i;
        }
        System.out.println("Total2: " + total2);

        /*
         * Utilizando métodos
         */
        System.out.println("1- addFirstN(5): " + Aula9.addFirstN(5));
        System.out.println("2- addFirstN(9): " + Aula9.addFirstN(9));

        /*
         * Mais métodos
         */
        Aula9.introducao("Victor", 24);
        Aula9.introducao("Gabi", 24, 1.80);

    }

    /*
     * O que compoem um método
     * 1. Method header
     * a - Modifiers (public, private, static, final, ...) -> vamos falar mais disso
     * no futuro
     * b - Return type (void, int, double, String, boolean, ...)
     * c - Nome
     * d - Lista de parametros
     * e - Method body {}
     */
    public static int addFirstN(int n) {
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static void introducao(String nome, int idade) {
        System.out.printf("Ola! Meu nome e %s e eu tenho %d anos!%n", nome, idade);
    }

    /*
     * Overloading de um método
     * Quando dois ou mais métodos na mesma classe têm o mesmo nome, mas parâmetros
     * diferentes, é chamado de Overloading.
     */

    public static void introducao(String nome, int idade, double altura) {
        System.out.printf("Ola! Meu nome e %s e eu tenho %d anos e minha altura e %.2f!%n", nome, idade, altura);
    }
}
