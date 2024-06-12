package flyweight.app2;

public class BookType {
  private String type;
  private String distributor;
  private String otherInfo;
  public BookType(String type, String distributor, String otherInfo){
    this.type = type;
    this.distributor = distributor;
    this.otherInfo = otherInfo;
  }
}
