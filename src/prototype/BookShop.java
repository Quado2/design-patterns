package prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
  private String shopName;
  List<Book>  books = new ArrayList<>();

  public String getShopName() {
    return shopName;
  }

  public List<Book> getBooks() {
    return books;
  }

  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }

  public void loadData(){
    for (int i = 1; i<=10; i++){
      Book b = new Book();
      b.setBid(i);
      b.setBname("Book "+i);
      books.add(b);
    }
  }

  @Override
  public String toString() {
    return "BookShop{" +
        "shopName='" + shopName + '\'' +
        ", books=" + books +
        '}';
  }

  @Override
  protected BookShop clone() throws CloneNotSupportedException {
    super.clone();
    BookShop bs = new BookShop();
    bs.books.addAll(books);
    return bs;
  }
}
