public class Books {        // Kitaplar için bir sınıf oluşturuyoruz
    private String bookName;
    private int totalNumberOfPages;
    private String authorName;

    private String releaseDate;

    public Books(String bookName, int totalNumberOfPages, String authorName, String releaseDate) {
        this.bookName = bookName;
        this.totalNumberOfPages = totalNumberOfPages;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getTotalNumberOfPages() {
        return totalNumberOfPages;
    }

    public void setTotalNumberOfPages(int totalNumberOfPages) {
        this.totalNumberOfPages = totalNumberOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
