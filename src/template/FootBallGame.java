package template;

public class FootBallGame extends Game{
  @Override
  void initialize() {
    System.out.println("Initialized a football game");
  }

  @Override
  void startPlay() {
  System.out.println("Started playing footbal game");
  }

  @Override
  void endPlay() {
    System.out.println("End football game");
  }
}
