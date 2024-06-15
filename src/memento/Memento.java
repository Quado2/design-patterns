package memento;

public class Memento {
  private String text;
  public Memento(String text) {
    this.text = text;
  }

  public String getSavedText(){
    return this.text;
  }
}
