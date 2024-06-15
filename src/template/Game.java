package template;

public abstract class Game {
   abstract void initialize();

   abstract void startPlay();

   abstract  void endPlay();

   public void playGame(){
     initialize();
     startPlay();
     endPlay();
   }

}
