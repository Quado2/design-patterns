package decorator;

public class Year2Fee implements SchoolFee{
  @Override
  public int getFee() {
    return 20000;
  }

  @Override
  public String getDescription() {
    return "Second year school fee";
  }
}
