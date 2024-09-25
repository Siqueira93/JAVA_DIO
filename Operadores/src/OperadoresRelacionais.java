public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nomeUm = "Raul";
        String nomeDois = "Raul";

        System.out.println(nomeUm == nomeDois); 
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        }
            
        System.out.println("Numero 1 é igual numero 2: " + simNao);
        
        simNao = numero1 != numero2;

        System.out.println("Numero 1 é diferente de numero 2: " + simNao);
        
        simNao = numero1 > numero2;

        System.out.println("Numero 1 é maior que numero 2: " + simNao);
    }    
}
