public class BreakEContinue {
    // break interrompe o laço de repetição do codigo
    public static void main(String[] args) {
        for( int numero = 1; numero <= 5; numero++){
            if(numero == 3)
                // break
                // no break ele para o codigo no resultado esperado e não continua o restante
                continue;
                // no continue ele so para no momento expecificado, e executa o restante do código
            
            System.out.println(numero);
        }
    }
    
}
