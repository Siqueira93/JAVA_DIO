import java.util.Locale;
// importa uma biblioteca de valor aleatorio

import java.util.Scanner;
// para fazer a impressão das informações acrescentadas pelo usuario

public class AboutMe {
    public static void main(String[] args) {
        //criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome");
        String nome = scanner.next();
        System.out.println("Digite o seu sobrenome");
        String sobrenome = scanner.next();
        System.out.println("Digite a sua idade");
        String idade = scanner.next();
        System.out.println("Digite a sua altura");
        String altura = scanner.next();


        System.out.println(" Olá me chamo " + nome + " " + sobrenome);
        System.out.println(" Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " cm");
    }
    
}
