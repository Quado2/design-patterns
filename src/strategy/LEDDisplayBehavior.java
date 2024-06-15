package strategy;

public class LEDDisplayBehavior implements IDisplayBehavior{
  @Override
  public void display() {
    System.out.println("Displayed on a LED");
  }
}
