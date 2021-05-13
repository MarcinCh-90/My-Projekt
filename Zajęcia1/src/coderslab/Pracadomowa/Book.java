package coderslab.Pracadomowa;

public class Book {
    private int id;
    private String title;
    private boolean available = true;
    //private boolean available;
    private Author mainAuthor;
    private Author[] additionalAuthors;

    public Book (int id, String title) {
        this.id = id;
        this.title = title;
    }
    public Book ( int id, String title, Author mainAuthor){
        this.id = id;
        this.title = title;
        this.mainAuthor = mainAuthor;
    }
    public Book ( int id, String title, Author mainAuthor, Author[] additionalAuthors) {
        this.id = id;
        this.title = title;
        this.mainAuthor = mainAuthor;
        this.additionalAuthors = additionalAuthors;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Author getMainAuthor() {
        return mainAuthor;
    }

    public void setMainAuthor(Author mainAuthor) {
        this.mainAuthor = mainAuthor;
    }

    public Author[] getAdditionalAuthors() {
        return additionalAuthors;
    }

    public void setAdditionalAuthors(Author[] additionalAuthors) {
        this.additionalAuthors = additionalAuthors;
    }

}
