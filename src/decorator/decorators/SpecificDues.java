package decorator.decorators;

import decorator.components.SchoolFee;

public abstract class SpecificDues extends SchoolFee {
   SchoolFee schoolfee;

   public SpecificDues(SchoolFee schoolfee){
     this.schoolfee = schoolfee;
   }
}
