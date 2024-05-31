package bridge;

import java.math.BigDecimal;

public class Trouses extends Cloth{

  public Trouses(Brand brand) {
    super(brand);
  }
  @Override
  BigDecimal buy() {
    return this.brand.getSellFactor().multiply(new BigDecimal("80"));
  }
}
