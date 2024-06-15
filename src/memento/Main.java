package memento;

public class Main {

  public static void main(String[] args){
    Editor editor = new Editor();
    editor.writeText("Hi Dude");
    editor.writeText("Hi dude, what's your name");
    System.out.println(editor.getText());
    editor.writeText("Hi dude, what's the name of your class");
    System.out.println(editor.getText());
    editor.undo();
    System.out.println(editor.getText());
    editor.undo();
    System.out.println(editor.getText());
    editor.undo();
    System.out.println(editor.getText());

  }
}
