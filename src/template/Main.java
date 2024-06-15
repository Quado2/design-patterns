package template;

public class Main {

  public static void main(String[] args) {
    Game football = new FootBallGame();
    Game tennis = new TennisGame();

    football.playGame();
    tennis.playGame();
  }
}
