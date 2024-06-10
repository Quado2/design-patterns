package command;

public class Main {

    public static void main(String[] args) {
        File file = new File("Music file");
        OpenFile openFileOperation = new OpenFile(file);
        WriteFile writeFileOperation = new WriteFile(file);

        FileExecutor fileExecutor = new FileExecutor(openFileOperation, writeFileOperation);

        System.out.println(fileExecutor.openFile());
        System.out.println(fileExecutor.writeFile());
        System.out.println(fileExecutor.undo());
        System.out.println(fileExecutor.undo());
    }
}
