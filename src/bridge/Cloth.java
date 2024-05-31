package bridge;

import java.math.BigDecimal;

public abstract class Cloth {
  protected Brand brand;
  public Cloth(Brand brand){
    this.brand = brand;
  }

  abstract BigDecimal buy ();
}
