import java.util.concurrent.ThreadLocalRandom;

public class While {
    // O laço WHILE (enquanto) determina enquanto uma condição for válida, o bloco de código será executado
    public static void main(String[] args) {
        /**String nome = "Raul";

        while (nome == "Raul") {
            System.out.println("Está correto");
            break;
        }
        */

        /**
         * Exercicio
         * Joãozinho recebeu 50,00 de mesada e foi em uma loja de doces para gastar todo seu dinheiro, logo, enquanto o valor dos doces não igualar a R$ 50,00
         * ele foi adicionando itens no carrinho.
         */

        double mesada = 50.0;
        //enquanto mesada maior que zero
        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;
                
            System.out.println("Doce valor: " + valorDoce%.2f + " Adicionado ao carrinho!");
            mesada = mesada - valorDoce;


        }
        System.out.println("Mesada " + mesada%.2f);
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2 , 8);
    }

    
}
