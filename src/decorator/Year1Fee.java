package decorator;

public class Year1Fee implements SchoolFee{
  @Override
  public int getFee() {
    return 80000;
  }

  @Override
  public String getDescription() {
    return "The first year school fee";
  }
}
