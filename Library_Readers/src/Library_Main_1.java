
public class Library_Main_1 {
    // @NotNull
    public static void main(java.lang.String[] args) {
        int n = 6;

        Reader[] readers = new Reader[n];
        readers[0] = new Reader("Петров", "В. В."); 
        readers[0].takeBook(3);

        readers[1] = new Reader("Петров", "В. В."); 
        readers[1].takeBook("Приключения","Словарь","Энциклопедия");
        
        Book book1 = new Book("Приключения");
        Book book2 = new Book("Словарь");
        Book book3 = new Book("Энциклопедия");
        
        readers[2] = new Reader("Петров", "В. В.");
        readers[2].takeBook(book1, book2, book3);

        readers[3] = new Reader("Петров", "В. В.");
        readers[3].returnBook(3);

        readers[4] = new Reader("Петров", "В. В.");
        readers[4].returnBook("Приключения","Словарь","Энциклопедия");

        readers[5] = new Reader("Петров", "В. В.");
        readers[5].returnBook(book1, book2, book3);
    }
}