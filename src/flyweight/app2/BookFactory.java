package flyweight.app2;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {

  private static Map<String, BookType> books = new HashMap<>();

  public static BookType getBookType(String type, String distributor, String otherInfo){
    if(books.get(type) == null) {
      books.put(type, new BookType(type, distributor, otherInfo));
    }
    return books.get(type);
  }
}
