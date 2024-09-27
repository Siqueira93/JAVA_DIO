import java.text.MessageFormat;
import java.util.Scanner;

public class projetoEscola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o proximo valor: ");
        int n2 = scanner.nextInt();

        System.out.println("valor do primeiro numero: " + n1);
        System.out.println("valor do segundo numero: " + n2);

        int soma = (n1+n2)*31;

        String resultado = MessageFormat.format("o resultado é: {0}", soma);
        System.err.println(resultado);
        
    }
}
