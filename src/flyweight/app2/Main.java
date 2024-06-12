package flyweight.app2;

public class Main {

  public static void main(String[] args) {
    Store store = new Store();
    store.storeBooks("Apart", 400, "Okonkwo Distribution","Tragedy","A very nice book");
    store.storeBooks("Okon", 550, "Okonkwo Distribution","Tragedy","A very nice book");
    store.storeBooks("Great thinking", 1440, "New Distributors","Motivationals","Crazy works");

    System.out.println(store.getBooks());
  }
}
