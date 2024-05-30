package factories;

public class Main {
  public static void main(String [] args) {
    System.out.println("Home");
    OperatingSystem windowsOs = OperatingSystemFactory.getInstance(OsType.WINDOWS,"3.34", "64BIT");
    OperatingSystem linuxOs = OperatingSystemFactory.getInstance(OsType.LINUX,"3.34", "64BIT");
    windowsOs.changeDir("home");
    linuxOs.changeDir("home");
  }
}
