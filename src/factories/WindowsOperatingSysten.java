package factories;

public class WindowsOperatingSysten extends OperatingSystem{
    public WindowsOperatingSysten(String version, String architecture) {
        super(version,architecture);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("Changed to windows - " + dir);
        //Windows command
    }

    @Override
    public void removeDir(String dir) {
        //Windows command
    }
}
