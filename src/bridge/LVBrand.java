package bridge;

import java.math.BigDecimal;

public class LVBrand implements Brand{
  @Override
  public BigDecimal getSellFactor() {
    return new BigDecimal("50");
  }
}
