import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Tolkien","The lord of the rings");
        Book book1 = new Book("J.K. Rowling","Harry Potter");
        Gson gson = new Gson();
        String bookJson = gson.toJson(book);
        String book1Json = gson.toJson(book1);
        System.out.println(bookJson);
        System.out.println(book1Json);
    }
}