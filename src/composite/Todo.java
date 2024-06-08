package composite;

public class Todo extends TodoList{

    private String html;
    private boolean isDone;

    @Override
    public boolean getIsDone(){
        return this.isDone;
    }

    public void setIsDone(){
        this.isDone = true;
    }

    public Todo (String html, boolean isDone) {
        this.html = html;
        this.isDone = isDone;
    }
    @Override
    public String getHtml() {
        return this.html;
    }
}
