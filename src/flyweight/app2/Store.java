package flyweight.app2;

import java.util.ArrayList;
import java.util.List;

public class Store {
  List<Book> books = new ArrayList<>();

  public void storeBooks(String name, int price, String distributor, String type, String otherInfo){
    BookType bookType = BookFactory.getBookType(type, distributor, otherInfo);
    Book book = new Book(name, price, bookType);
    books.add(book);
  }

  public List<Book> getBooks(){
    return this.books;
  }
}
