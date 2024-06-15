package strategy;

public class Main {
  public static void main(String[] args){
    Dog chiwawa = new Dog(new LCDDisplayBehavior(), new HarshBarkBehavior(), new RunBehavior());
    Dog shephered = new Dog(new LEDDisplayBehavior(), new SoftBarkBehavior(), new RunBehavior());
    chiwawa.bark();
    shephered.bark();
    chiwawa.display();
    shephered.display();
    chiwawa.run();
    shephered.run();
  }
}
