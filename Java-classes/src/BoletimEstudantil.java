public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 10;
        if(mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("NA RISCA!!!");
        else
            System.out.println("APROVADO");
    }
}
