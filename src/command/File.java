package command;

public class File {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public String openFile(){
        return "Opening file: " + this.name;
    }

    public String closeFile(){
        return "Closing file: "+ this.name;
    }

    public String writeToFile(){
        return "Writing to file: " +this.name;
    }

    public String deleteFromFile(){
        return "Deleting from file: "+ this.name;
    }
}
