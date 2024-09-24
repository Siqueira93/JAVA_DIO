public class MinhaClasse {
    
    public static void main (String [] args) {
        String meuNome = "Raul";
        int anoNascimento = 1993;
        boolean verdadeira = true;

        verdadeira = false;

        System.out.println(meuNome);
        System.out.println(anoNascimento);
        System.out.println(verdadeira);

        String primeiroNome = "Raul";
        String segundoNome = "Soares";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
        
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Meu nome completo é: ".concat(primeiroNome).concat(" ").concat(segundoNome);
    }
}
