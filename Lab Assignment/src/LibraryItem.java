import java.util.Objects;

public class LibraryItem {
    private String title;
    private String author;
    private int year;
    private int isBorrowed;
    public LibraryItemType itemType;
    public LibraryItem(String title,String author,int year, int isBorrowed){
        this.title= title;
        this.author=author;
        this.year=year;
        this.isBorrowed=isBorrowed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(int borrowed) {
        isBorrowed = borrowed;
    }

    public void setItemType(LibraryItemType itemType) {
        this.itemType = itemType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryItem that)) return false;
        return year == that.year && isBorrowed == that.isBorrowed && Objects.equals(title, that.title) && Objects.equals(author, that.author) && itemType == that.itemType;
    }

}
