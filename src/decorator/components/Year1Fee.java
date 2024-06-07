package decorator.components;

public class Year1Fee extends SchoolFee{
  @Override
  public int getFee() {
    return 80000;
  }

  @Override
  public String getDescription() {
    return "The first year school fee";
  }
}
