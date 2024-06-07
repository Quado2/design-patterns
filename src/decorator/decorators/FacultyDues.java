package decorator.decorators;

import decorator.components.SchoolFee;

public class FacultyDues extends SpecificDues{

  public FacultyDues(SchoolFee schoolFee){
    super(schoolFee);
  }
  @Override
  public int getFee() {
    return this.schoolfee.getFee() + 3500;
  }

  @Override
  public String getDescription() {
    return this.schoolfee.getDescription() + " + Faculty dues";
  }
}
