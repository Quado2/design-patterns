package state;

import state.Canvas;
import state.SelectionTool;

public class Main {

  public static void main(String[] args) {

    //State
    Canvas canvas = new Canvas();
    canvas.setCurrentTool(new SelectionTool());
    canvas.mouseDown();
    canvas.mouseUp();
  }
}