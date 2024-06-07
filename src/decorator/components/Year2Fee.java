package decorator.components;

public class Year2Fee extends SchoolFee{
  @Override
  public int getFee() {
    return 20000;
  }

  @Override
  public String getDescription() {
    return "Second year school fee";
  }
}
