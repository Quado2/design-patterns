package decorator.decorators;

import decorator.components.SchoolFee;

public class DepartmentDues extends SpecificDues{

  public DepartmentDues(SchoolFee schoolFee) {
    super(schoolFee);
  }
  @Override
  public int getFee() {
    return this.schoolfee.getFee() + 1500;
  }

  @Override
  public String getDescription() {
    return this.schoolfee.getDescription() + " + Departmental dues";
  }
}
