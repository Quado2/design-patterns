package state;

public class BrushTool  implements  Tool{

  @Override
  public void mouseUp() {
    System.out.println("Erase Selected Object");
  }

  @Override
  public void mouseDown() {
    System.out.println("Show erase symbol");
  }
}
