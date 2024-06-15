package memento;

import org.w3c.dom.Text;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Editor {
  private TextArea textArea;
  private Deque<Memento> stateHistory;

  public Editor(){
    this.textArea = new TextArea();
    this.stateHistory = new LinkedList<>();
  }

  public void writeText(String text) {
    textArea.set(text);
    stateHistory.add(textArea.takeSnapshot());
  }

  public void undo(){
    stateHistory.pollLast();
    if(stateHistory.size() > 0){
      textArea.restore(stateHistory.getLast());
    } else {
      textArea.set("Null");
    }

  }

  public String getText(){
    return textArea.getText();
  }
}
