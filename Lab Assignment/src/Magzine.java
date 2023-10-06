public class Magzine extends LibraryItem{
    int issueNumber;
    Magzine(String title,String author,int year, int isBorrowed,int issueNumber){
        super(title, author, year, isBorrowed);
        this.issueNumber=issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
}
