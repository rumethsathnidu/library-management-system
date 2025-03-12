public class Libapp {
    
    public static void main(String[] args) {
        library library = new library();
        char choise;
        do
        {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. See all Books");
            System.out.println("4. Register Member");
            System.out.println("5. Remove Member");
            System.out.println("6. See all Members");
            System.out.println("7. Search Book Information");
            System.out.println("8. Search Member Information");  
            System.out.println(" ");
            
            choise = search.nextChar();
            System.out.println();
            
            switch (choise) 
                {
                    case '1': option1(library);break;
                    case '2': option2(library);break;
                    case '3': option3(library);break;
                    case '4': option4(library);break;
                    case '5': option5(library);break;
                    case '6': option6(library);break;
                   // case '7': option7(library);break;
                   // case '8': option8(library);break;
                
            
                    default: break;
                    
                }
        }
        while (choise !=9);
}
    public static void option1(library libraryin)
    {
        System.out.print("Enter Book ID: ");
        String b_id = search.nextString();
        System.out.print("Enter Book name: ");
        String b_name = search.nextString();
        book book = new book(b_name, b_id);
        libraryin.addbook(book);
        

    }

   
    public static void option2(library libraryin)
    {
        System.out.print("Enter Book Code : ");
        String id = search.nextString();

        boolean found = libraryin.removeBook(id);
            if(found)
            {
                System.out.println("Book Removed");
            }
            else
            {
                System.out.println("Invaild Book ID");
            }
    }

    public static void option3(library libraryin)
    {
        System.out.println("Here are the all books in the library");
        libraryin.viewallbooks();
    }

    public static void option4(library libraryin)
    {
        System.out.print("Enter Member ID: ");
        String m_id = search.nextString();
        System.out.print("Enter Member name: ");
        String m_name = search.nextString();
        book book = new book(m_name, m_id);
        libraryin.addbook(book);
        

    }

   
    public static void option5(library libraryin)
    {
        System.out.print("Enter Member ID : ");
        String id = search.nextString();

        boolean found = libraryin.removemember(id);
            if(found)
            {
                System.out.println("Book Removed");
            }
            else
            {
                System.out.println("Invaild Book ID");
            }
    }

    public static void option6(library libraryin)
    {
        System.out.println("Here is the list of every Member");
        libraryin.viewallmembers();
    }

}
