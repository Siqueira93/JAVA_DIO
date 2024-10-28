/*
 * Laço do / while (faça / enquanto)
 * Assim como o laço while, considera que enquanto uma determinada condição for válida o bloco de código será executado.
 * Entretanto, do / while testa a condição após executar o código, sendo assim, mesmo que a condição seja considerada inválida no primeiro teste
 * o bloco será executado pelo menos uma vez
 * 
 */

 /*
  * Joãozinho resolveu ligar para seu amigo e informar que se intupiu de doces
  */
import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando... ");

        do {
            System.out.println("Telefone Tocando");
        }
        while (tocando());

        System.out.println("Alô !!!!!");
        
    }
    
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }
}
