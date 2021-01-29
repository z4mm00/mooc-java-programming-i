public class Book {

    private String title;
    private int numOfPages;
    private int yearOfPub;

    public Book(String initialTitle, int initialNumPages, int initialPubYear) {
        this.title = initialTitle;
        this.numOfPages = initialNumPages;
        this.yearOfPub = initialPubYear;
    }
    public String name() {
        return this.title;
    }

    public String toString() {
        return this.title + ", " + this.numOfPages + " pages, " + this.yearOfPub;
    }
}
