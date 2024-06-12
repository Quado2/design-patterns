package flyweight.app2;

public class Book {
  private String name;
  private int price;
  private BookType type;

  public Book(String name, int price, BookType bookType){
    this.name = name;
    this.price = price;
    this.type = bookType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public BookType getType() {
    return type;
  }

  public void setType(BookType type) {
    this.type = type;
  }
}
