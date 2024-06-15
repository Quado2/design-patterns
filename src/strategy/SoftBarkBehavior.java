package strategy;

public class SoftBarkBehavior implements IBarkBehavior{
  @Override
  public void bark() {
    System.out.println("Barks softly");
  }
}
