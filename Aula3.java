public class Aula3 {
    public static void main(String[] args) {

        // Expressoes
        // ***************************************************************************************************

        // Esquerda para a direita, porem os () tem prioridade
        int total = 5 + 3 * (5 + 3) / 4 - 10;
        // total = 5 + 3 * (8) / 4 - 10
        // total = 5 + 24 / 4 - 10
        // total = 5 + 6 - 10
        // total = 11 - 10
        // total = 1
        // System.out.println(total);

        // Operadores
        // ***************************************************************************************************

        // Operadores aritmeticos em Java
        int soma = 5 + 5;
        int sub = 6 - 4;
        int mult = 3 * 3;
        int div = 11 / 5;
        int mod = 5 % 10;
        // System.out.println("Soma: " + soma);
        // System.out.println("Sub: " + sub);
        // System.out.println("mult: " + mult);
        // System.out.println("div: " + div);
        // System.out.println("mod: " + mod);
        soma++;
        sub--;
        // System.out.println("soma2: " + soma);
        // System.out.println("sub2: " + sub);

        // Operadores de Atribuicao
        int meuNum = 10;
        soma += 5;
        mult /= 9;
        // System.out.println(meuNum);
        // System.out.println("soma2: " + soma);
        // System.out.println("mult2: " + mult);

        // Operadores de comparacao
        int num1 = 0;
        int num2 = 10;
        int num3 = 10;
        // System.out.println(num1 == num2);
        // System.out.println(num2 == num3);
        // System.out.println(num1 != num2);
        // System.out.println(num1 > num2);
        // System.out.println(num1 < num2);
        // System.out.println(num3 >= num2);
        // System.out.println(num1 <= num2);

        // Operadores logicos
        // System.out.println(num2 > 0 && num2 <= 10);
        // System.out.println(num2 > 0 || num2 < 10);
        // System.out.println(!(num2 > 0 && num2 < 10));

        // CONVERSAO
        // ***************************************************************************************************

        // Conversao de tipos
        // Lebra que nao podemos mudar o tipo de uma variavel em java
        // int x = 1.23;

        // A gente nao pode fazer o seguinte:
        // short s = 12345678L;

        // Mas ir de um tipo "menor" para um maior e possivel:
        short s2 = 100;
        int i = s2;

        // Conversoes: existem algumas maneiras de converter os tipos de numero
        // Conversoes por atribuicao
        double num4 = 3; // O 3 vai ser covertido para 3.0
        // System.out.println(num4);

        // Conversao por aritmetica
        int d = 4;
        double d2 = d / 4.0;
        // System.out.println(d2);

        // Conversao por Casting
        // int meuInt = 1.99;
        int meuInt = (int) 1.99;
        // System.out.println(meuInt);
    }
}
