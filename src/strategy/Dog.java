package strategy;

public class Dog {
  private IDisplayBehavior displayBehavior;
  private IBarkBehavior barkBehavior;
  private IRunBehavior runBehavior;

  public Dog(IDisplayBehavior db, IBarkBehavior bb, IRunBehavior rb){
    this.barkBehavior = bb;
    this.displayBehavior= db;
    this.runBehavior = rb;
  }

  public void run(){
    this.runBehavior.run();
  }

  public void display(){
    this.displayBehavior.display();
  }

  public void bark(){
    this.barkBehavior.bark();
  }
}
