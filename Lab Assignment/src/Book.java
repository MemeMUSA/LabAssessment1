public class Book extends LibraryItem{
    int pageCount;
    Book(String title,String author,int year, int isBorrowed,int pageCount){
        super(title, author, year, isBorrowed);
        this.pageCount=pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
