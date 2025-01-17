public class Book {
    private String nameOfAuth;
    private String title;

    public Book(String name) { setNameOfAuth(name); }

    public void setNameOfAuth(String name) {
        this.nameOfAuth = name;
    }
    public void setTitle(String des) {
        this.title = des;
    }
    public String getNameOfAuth() {return nameOfAuth;}
    public String getDesign() {return title;}

}