package template;

public class TennisGame extends Game{
  @Override
  void initialize() {
    System.out.println("Initialize a Tennis Game");
  }

  @Override
  void startPlay() {
    System.out.println("Start Tennis Game");
  }

  @Override
  void endPlay() {
    System.out.println("End Tennis Game");
  }
}
