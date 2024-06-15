package strategy;

public class HarshBarkBehavior implements IBarkBehavior{
  @Override
  public void bark() {
    System.out.println("Barks hashly");
  }
}
