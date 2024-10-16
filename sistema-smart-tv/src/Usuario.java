public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartv = new SmartTv(); //Orientação a Objetos;

        System.out.println("TV LIGADA ? " + smartv.ligada);
        System.out.println("Canal Atual : " + smartv.canal);
        System.out.println("Volume total ? " + smartv.volume);
        
        // INTERAÇÃO COM O USARIO
        smartv.ligar(); // usuário aperta no BOTÃO LIGAR
        System.out.println("Novo Status -> TV LIGADA ? " + smartv.ligada); 
        
        smartv.desligar(); // usuário aperta no BOTÃO DESLIGAR
        System.out.println("Novo Status -> TV DESLIGADA ? " + smartv.ligada);

        //PRÓXIMO
        smartv.aumentarVolume(); // usuário aperta no BOTÃO VOLUME +
        System.out.println("Aumentou o volume: " + smartv.volume); // 26
    

        smartv.diminuirVolume(); // usuário aperta no BOTÃO VOLUME - 
        System.out.println("Diminuiu o volume: " + smartv.volume); // 25
        smartv.diminuirVolume(); // usuário aperta no BOTÃO VOLUME - 
        System.out.println("Diminuiu o volume: " + smartv.volume); // 24
        smartv.diminuirVolume(); // usuário aperta no BOTÃO VOLUME - 
        System.out.println("Diminuiu o volume: " + smartv.volume); // 23

        //PRÓXIMO
        smartv.proximoCanal(); // usuário aperta no BOTÃO VOLUME +
        System.out.println("Mudou para o canal: " + smartv.canal); // 2
        smartv.proximoCanal(); // usuário aperta no BOTÃO VOLUME +
        System.out.println("Mudou para o canal: " + smartv.canal); // 3
        smartv.proximoCanal(); // usuário aperta no BOTÃO VOLUME +
        System.out.println("Mudou para o canal: " + smartv.canal); // 4
        smartv.proximoCanal(); // usuário aperta no BOTÃO VOLUME +
        System.out.println("Mudou para o canal: " + smartv.canal); // 5
    

        smartv.voltarCanal(); // usuário aperta no BOTÃO VOLUME - 
        System.out.println("Mudou para o canal: " + smartv.canal); // 4

        smartv.mudarCanal(2);
        System.out.println("Canal atual é: " + smartv.canal); //2

        
        
    }
}
