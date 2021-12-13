public class Aula10 {
    public static void main(String[] args) {
        /*
         * Arrays!
         * - Se quiséssemos armazenar 100 números, sem Arrays teríamos que declarar 100
         * variáveis (x_x).
         * - Arrays armazenam uma coleção sequencial de tamanho fixo de elementos do
         * mesmo tipo (primitivos ou Objetos) e pode ser considerado uma lista de
         * valores numerados (indexados) começando com 0.
         * - Cada um dos valores armazenado é chamado de elemento.
         */

        /*
         * Como criar uma Array:
         * Tipo[] nomeDaVariavel = new Tipo[tamanho];
         * ou
         * Tipo[] nomeDaVariavel = {elemento1, element2, elemento3, ...};
         */

        String[] nomes = new String[10];
        String[] sobrenomes = { "Silva", "Monet", "Hugo" };
        int[] meusNumeros = { 1, 69, 101, 70 };

        /*
         * Acessando um elemento da array
         */

        System.out.println(sobrenomes[0]);
        System.out.println(meusNumeros[3]);

        /*
         * Setando um elemento de uma array a um valor
         */

        sobrenomes[0] = "Michael";
        System.out.println(sobrenomes[0]);

        /*
         * Pegando o tamanho de uma array
         */

        System.out.println(nomes.length);
        System.out.println(meusNumeros.length);

        /*
         * Iterando sobre um array
         */

        for (String sobrenome : sobrenomes) {
            System.out.println(sobrenome);
        }

        for (int i = 0; i < sobrenomes.length; i++) {
            System.out.println(sobrenomes[i]);
        }

        /*
         * Pegando o index de um elemento usando for loop
         */

        String sobrenomeTarget = "Monet";
        for (int i = 0; i < sobrenomes.length; i++) {
            if (sobrenomes[i].equals(sobrenomeTarget)) {
                System.out.println("Target Index: " + i);
                break;
            }
        }
    }
}
