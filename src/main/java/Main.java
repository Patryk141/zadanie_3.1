import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Book book_ = new Book("Tolkien","The lord of the rings");
        Book book_1 = new Book("J.K. Rowling","Harry Potter");
        Gson gson = new Gson();
        String bookJson = gson.toJson(book_);
        String book1Json = gson.toJson(book_1);
        System.out.println(bookJson);
        System.out.println(book1Json);
    }
}
