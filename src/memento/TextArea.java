package memento;

public class TextArea {
  private String text;

  public void set(String text) {
    this.text = text;
  }

  public Memento takeSnapshot(){
    return new Memento(this.text);
  }

  public void restore(Memento memento){
    this.text = memento.getSavedText();
  }

  public String getText(){
    return this.text;
  }
}
