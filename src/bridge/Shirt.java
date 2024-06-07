package bridge;

import java.math.BigDecimal;

public class Shirt extends  Cloth{

  public Shirt(Brand brand){
    super(brand);
  }
  @Override
  BigDecimal buy() {
    return this.brand.getSellFactor().multiply(new BigDecimal("40"));
  }
}
