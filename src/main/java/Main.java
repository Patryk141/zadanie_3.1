import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Book book_ = new Book("Tolkien","The lord of the rings");
        Book book_1 = new Book("J.K. Rowling","Harry Potter");
        Gson gson = new Gson();
        String bookGson = gson.toJson(book_);
        String book1Gson = gson.toJson(book_1);
        System.out.println(bookGson);
        System.out.println(book1Gson);
    }
}
