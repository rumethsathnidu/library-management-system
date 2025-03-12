import java.util.*;

public class library {

private List<book> books;
private List<member> members;

private int searchB(String bookIndex)
    {
	for(int i = 0; i <= books.size() - 1; i++)
	{
            book temp = books.get(i); // find the book at index i
            String tempNumber = temp.getBookCode(); // get account number
            if(tempNumber.equals(bookIndex)) // if this is the account we are looking for
            {
		return i; // return the index
            }
	}
	return -999;
    }

private int searchM(String memberIndex)
    {
	for(int i = 0; i <= members.size() - 1; i++)
	{
            member temp = members.get(i); // find the account at index i
            String tempNumber = temp.getMembercode(); // get account number
            if(tempNumber.equals(memberIndex)) // if this is the account we are looking for
            {
		return i; // return the index
            }
	}
	return -999;
    }

public library()
{
    books = new ArrayList<>();
    members = new ArrayList<>();
}

public void addbook(book book)
{
    books.add(book);
}

public boolean removeBook(String bookId) 
{
    int index = searchB(bookId);
    if (index != -999){
        books.remove(index);
           return true; // remove was successful
       }
       else
       {
           return false; // remove was unsuccessful

    }

}

public void addmember(member member)
{
    members.add(member);
}

public boolean removemember(String memberid) 
{
    int index = searchM(memberid);
    if (index != -999){
        members.remove(index);
           return true; // remove was successful
       }
       else
       {
           return false; // remove was unsuccessful

    }

}

public void viewallbooks()
{
    books.forEach(System.out::println);
}

public void viewallmembers()
{
    for(int i=0;i<members.size();i++){
        System.out.println(members.get(i));
    } 
}

/*ublic boolean borrowbook(String bookId, String memberId) 
{
    int Bindex = searchB(bookId);
    int Mindex = searchM(memberId);
    if (Bindex != -999 && Mindex != -999){
        

    }*/

}



