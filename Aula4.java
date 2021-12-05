public class Aula4 {
    public static void main(String[] args) {
        /*
         * Estruturas Condicionais - if / else if / else
         * 
         * Possibilita ao desenvolvedor o poder de controlar quais
         * são as tarefas e trechos de código executados de acordo
         * com diferentes situações, como os valores de variáveis.
         * Creditos: Treinaweb
         */

        // Exemplo Bebida - if / else
        final int IDADE_MINIMA = 18;
        int suaIdade = 17;

        // if (suaIdade >= IDADE_MINIMA) {
        // System.out.println("Voce pode beber, mas com cuidado");
        // } else {
        // System.out.println("Voce teoricamente nao pode beber");
        // }

        // Exemplo notas - if / else if / else

        int nota = 40;

        // if (nota >= 90) {
        // System.out.println("Nota final: A");
        // } else if (nota >= 80) {
        // System.out.println("Nota final: B");
        // } else if (nota >= 70) {
        // System.out.println("Nota final: C");
        // } else if (nota >= 60) {
        // System.out.println("Nota final: D");
        // } else {
        // System.out.println("Nota final: F");
        // }

        // else if (nota == 85) {
        // System.out.println("Voce tirou a nota especial!!!!");
        // }

        /*
         * Operador condicional ternario
         * (expressão booleana) ? código 1 : código 2;
         */
        System.out.println(
                suaIdade >= IDADE_MINIMA ? "Voce pode beber, mas com cuidado" : "Voce teoricamente nao pode beber");

        /*
         * Switch é uma instrução condicional de diversos desvios, isso quer dizer que,
         * de acordo
         * com o resultado de uma condição pode-se executar um desvio entre os vários
         * possíveis.
         * 
         * A instrução switch avalia o valor (literal) resultante de uma expressão ou
         * variável, que
         * chamamos de condição no parágrafo acima e, de acordo com esse valor, que pode
         * ser dos tipos:
         * char, byte, int, short, String ou um tipo enumerado, desvia a execução dos
         * programas para um dos casos
         * através da palavra chave case.
         * Creditos: DevMedia
         */

        int month = 3;
        String mes;

        switch (month) {
            case 1:
                mes = "January";
                break;
            case 2:
                mes = "February";
                break;
            case 3:
                mes = "March";

            case 4:
                mes = "April";

            case 5:
                mes = "May";
                break;
            case 6:
                mes = "June";

            case 7:
                mes = "July";
                break;
            case 8:
                mes = "August";
                break;
            case 9:
                mes = "September";
                break;
            case 10:
                mes = "October";
                break;
            case 11:
                mes = "November";
                break;
            case 12:
                mes = "December";
                break;
            default:
                mes = "Invalid month";
                break;
        }
        System.out.println(mes);
    }
}
