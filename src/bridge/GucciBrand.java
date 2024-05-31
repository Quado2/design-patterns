package bridge;

import java.math.BigDecimal;

public class GucciBrand implements  Brand{
  @Override
  public BigDecimal getSellFactor() {
    return new BigDecimal("90");
  }
}
