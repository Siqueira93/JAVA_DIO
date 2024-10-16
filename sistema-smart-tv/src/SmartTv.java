/*
     * Vamos 
     * 1. Ela tenha as caracteristicas: ligada (boolean), canal(int) e volume (int)
     * 2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada
     * 3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
     * 4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente
     */
public class SmartTv {
   boolean ligada = false;
   int canal = 1;
   int volume = 25;
   String marca = "SONY";


   /* 2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada */
   public void ligar(){
      ligada = true;
      //Aqui confirmo que a TV está ligada igual a TRUE
   }
   public void desligar(){
      ligada = false;
      //Aqui confirmo que a TV está desligada igual a FALSE
   }

   /* 3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1 */
   public void aumentarVolume(){
     //volume = volume + 1; 
      volume++; 
   }
   public void diminuirVolume(){
     //volume = volume - 1; 
      volume--; 
   }

   /* 4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente */
   public void mudarCanal( int novoCanal){
      canal = novoCanal;
   }
   public void proximoCanal(){
     //volume = volume + 1; 
      canal++; 
   }
   public void voltarCanal(){
     //volume = volume - 1; 
      canal--; 
   }


}
