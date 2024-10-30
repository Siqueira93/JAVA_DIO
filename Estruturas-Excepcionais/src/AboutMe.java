import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*
 Tratamento de exceções 
 E quando inevitavelmente ocorrer uma exceção? Como nós desenvolvedores podemos ajustar o nosso algoritmo para amenizar o ocorrido?
 A instrução TRY permite que você defina um bloco de código para ser testado quanto a erros enquanto está sendo executado
 A instrução CATCH permite definir um bloco de código a ser executado, caso ocorra um erro de bloco TRY
 A instrução FINALLY permite definir um bloco de código a ser executado independente de ocorrer um erro ou não. As palavras-chave TRY e CATCH vem em pares:

 * TRY - dispara o erro
 * try {
 *  // bloco de código conforme o esperado
 * }
 * 
 * Catch - corrige o erro
 * catch(Exception e) { //Precisamos saber qual exceção
 *  // bloco de código que captura as exceções que podem acontecer
 *  // em caso de fluxo não previsto
 * }
 */

public class AboutMe {
    public static void main(String[] args) {
        try {
        //criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        //caso o usuario digite caractere ao inves de numeros

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

         //imprimindo os dados obtidos pelo usuario
         System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome);
         System.out.println("Tenho " + idade + " anos ");
         System.out.println("Minha altura é : " + altura + "cm ");
            
        } catch (InputMismatchException  e) {
            // TODO: handle exception
            System.out.println("Erro");

        }
        
        
    }   
}
