import java.util.Scanner;

public class ResultadoEscolar3 {

    // CONDIÇÃO TERNARIA
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do Aluno: ");
        int nota = scanner.nextInt();

        // Se resutado for igual ou maior a 7 imprime aprovado se não resprovado
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

    }
    
}
