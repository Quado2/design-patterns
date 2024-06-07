package bridge;

import java.math.BigDecimal;

public class Gown extends Cloth{

  public Gown (Brand brand) {
    super(brand);
  }
  @Override
  BigDecimal buy() {
    return this.brand.getSellFactor().multiply(new BigDecimal("120"));
  }
}
