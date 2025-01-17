public class Reader {
    private String name;
    private String surname;
    /*
    private String patron;
    private int numbOfTic;
    private String faculty;
    private int birthdate;
    private int numbOfTel;
    */
    Reader(String surname, String name) { 
        this.surname = surname;
        this.name = name;
    }
    
    public void takeBook(int volOfBook) {
        System.out.println(name +" "+ surname +" взял "+ volOfBook +" книги");
    }  
    public void takeBook(String... volOfBook) {
        System.out.print("Петров В. В. взял книги: ");
        for (String book : volOfBook) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }  
    public void takeBook(Book... nameOfAuth) {
        System.out.print("Петров В. В. взял книги: ");
        for (Book book : nameOfAuth) {
            System.out.print(book.getNameOfAuth() + ", ");
        }
        System.out.println();
    }
    
    public void returnBook(int volOfBook) {
        System.out.println(name +" "+ surname +" вернул "+ volOfBook +" книги");
    } 
    public void returnBook(String... volOfBook) {
        System.out.print("Петров В. В. вернул книги: ");
        for (String book : volOfBook) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }
    public void returnBook(Book... nameOfAuth) {
        System.out.print("Петров В. В. вернул книги: ");
        for (Book book : nameOfAuth) {
            System.out.print(book.getNameOfAuth() + ", ");
        }
    } 
}