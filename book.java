public class book {
    private String BookName;
    private String BookCode;
    private boolean isLent;

    public book (String nameofthebook,String codeofthebook)
    {
        BookName = nameofthebook;
        BookCode = codeofthebook;
        isLent = false;
    }

    public String getBookName()
    {
        return BookName;
    }

    public String getBookCode()
    {
        return BookCode;
    }

    public boolean islent()
    {
        return isLent;
    }
}
