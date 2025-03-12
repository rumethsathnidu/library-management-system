import java.util.List;

public class member {
    private String MemberName;
    private String MemberCode;
    private List<book> borrowedBooks;

    public member (String nameofthemember,String codeofthemember)
    {
        MemberName = nameofthemember;
        MemberCode = codeofthemember;
    }

    public String getMembername()
    {
        return MemberName;
    }

    public String getMembercode()
    {
        return MemberCode;
    }

    public void borrowBook(book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(book book) {
        borrowedBooks.remove(book);
    }
    
}
