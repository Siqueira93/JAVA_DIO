import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o plano desejado:");
        System.out.println("T / M / B");
        String plano = scanner.next();

        switch (plano) {
            case "T": {
                System.out.println("5gb Youtube");
                break;
            }
            case "M":{
                System.out.println("Whats e Instagram grátis");
                break;
            }
            case "B": {
                System.out.println("100 minutos de ligação");
                break;
            }
            default:
                System.out.println("Não aplicado");
                break;
        } 
    }
    
}
