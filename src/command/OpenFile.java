package command;

public class OpenFile implements FileOperation{

    File file;

    public OpenFile(File file) {
        this.file = file;
    }
    @Override
    public String execute() {
        return file.openFile();
    }

    @Override
    public String unexecute() {
        return file.closeFile();
    }
}
