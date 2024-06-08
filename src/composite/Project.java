package composite;

import java.util.List;

public class Project extends TodoList{

    private String title;
    private List<TodoList> todoLists;
    public Project(String title, List<TodoList> todoLists) {
        this.title = title;
        this.todoLists = todoLists;
    }

    public void addTodo(TodoList todoList){
      todoLists.add(todoList);
    }

    @Override
    public String getHtml() {
        String html = "<h3>" + this.title + "</h3>";
        html += "<ul>";
        for(TodoList list: this.todoLists) {
            html += "<li>" + list.getHtml() + "</li>";
        }
        html += "</ul>";
        return html;
    }

    @Override
    public boolean getIsDone() {
        boolean isDone = true;
        for(TodoList list: this.todoLists) {
            isDone = isDone && list.getIsDone();
        }
        return isDone;
    }
}
