package command;

import java.util.ArrayList;
import java.util.List;

public class FileExecutor {
    OpenFile openFile;
    WriteFile writeFile;

    List<FileOperation> fileOperations = new ArrayList<>();

    public FileExecutor(OpenFile openFile, WriteFile writeFile){
        this.openFile = openFile;
        this.writeFile = writeFile;
    }

    public String openFile(){
        fileOperations.add(this.openFile);
        return this.openFile.execute();
    }

    public String writeFile(){
        fileOperations.add(this.writeFile);
        return this.writeFile.execute();
    }

    public String undo(){
        FileOperation operation = pop(this.fileOperations);
        return operation.unexecute();
    }

    FileOperation pop(List<FileOperation> operations) {
       if(operations.isEmpty()){
           throw new IndexOutOfBoundsException("Cannot po from an empty list");
       }
       return operations.remove(operations.size() -1);
    }
}
