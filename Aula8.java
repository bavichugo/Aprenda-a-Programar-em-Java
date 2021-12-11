public class Aula8 {

    enum Level {
        BAIXO,
        MEDIO,
        ALTO
    }

    public static void main(String[] args) {
        /*
         * Enums
         * 
         * Um enum é uma "classe" especial que representa um grupo de constantes
         * (variáveis ​​imutáveis, como variáveis ​​finais).
         */

        /*
         * Acessando um enum usando o "dot" notation
         */
        Level level = Level.BAIXO;
        System.out.println(level + "\n");

        /*
         * Enums são frequentemente usados ​​em switches para verificar os
         * valores correspondentes:
         */
        switch (level) {
            case BAIXO:
                System.out.println("Level Baixo\n");
                break;
            case MEDIO:
                System.out.println("Level Medio\n");
                break;
            case ALTO:
                System.out.println("Level Alto\n");
                break;
            default:
                System.out.println("Nao e um level\n");
                break;
        }

        /*
         * Loopando sobre os valores de um Enum
         */
        for (Level l : Level.values()) {
            System.out.println(l);
        }

        /*
         * Metodos
         * 
         * name() - retorna o nome do enum como String
         * ordinal() - retorna a posicao da constante dentro do enum
         */
        String levelNome = level.name();
        System.out.println("Nome: " + levelNome);

        int posicao = level.ordinal();
        System.out.println("Posicao: " + posicao);

        /*
         * Utilizando enum criado em outro arquivo (Animal.java)
         */
        Animal cachorro = Animal.CACHORRO;
        switch (cachorro) {
            case CACHORRO:
                System.out.println("Auauauauau");
                break;
            case GATO:
                System.out.println("Miau miau");
                break;
            case PAPAGAIO:
                System.out.println("*le em voz de papagaio* SE TA LOCO MERMAO");
                break;
            default:
                System.out.println("Nao e um animal");
                break;
        }
    }
}
