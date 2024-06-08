package composite;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TodoList wakeup = new Todo("Sleep", true);
        TodoList pray = new Todo("Pray", true);
        TodoList exercise = new Todo("Exercise", true);

        TodoList workMeeting = new Todo("Meeting", true);
        Todo workRepo = new Todo("Repo", false);

        List<TodoList> works = new ArrayList<>();
        works.add(workRepo);
        works.add(workMeeting);
        TodoList nasimsWork = new Project("Nasims", works);

        List<TodoList> allList = new ArrayList<>();
        allList.add(wakeup);
        allList.add(pray);
        allList.add(exercise);
        allList.add(nasimsWork);

        TodoList todos = new Project("Daily Routing", allList);

        System.out.println("Todos html: ");
        System.out.println(todos.getHtml());
        System.out.println("Is all done?: "+todos.getIsDone());

        workRepo.setIsDone();

        System.out.println("Todos html: ");
        System.out.println(todos.getHtml());
        System.out.println("Is all done?: "+todos.getIsDone());


    }
}
