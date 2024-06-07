package decorator;

import decorator.components.SchoolFee;
import decorator.components.Year1Fee;
import decorator.components.Year2Fee;
import decorator.decorators.DepartmentDues;
import decorator.decorators.FacultyDues;

public class Main {
  public static void main(String [] args) {
    SchoolFee year1SchoolFees = new FacultyDues(new DepartmentDues( new Year1Fee()));
    System.out.println("Year one school fees total: " + year1SchoolFees.getFee());
    System.out.println("Year one school fees description: " + year1SchoolFees.getDescription());

    SchoolFee year2SchoolFees = new FacultyDues(new DepartmentDues( new Year2Fee()));
    System.out.println("Year two school fees total: " + year2SchoolFees.getFee());
    System.out.println("Year two school fees description: " + year2SchoolFees.getDescription());
  }
}
