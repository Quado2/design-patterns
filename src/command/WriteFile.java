package command;

public class WriteFile implements FileOperation{

    private File file;

    public WriteFile(File file){
        this.file = file;
    }

    @Override
    public String execute() {
        return file.writeToFile();
    }

    @Override
    public String unexecute() {
        return file.deleteFromFile();
    }
}
