import java.util.Scanner;

class Library {
    public int totalAvailableBooks ;
     String[] availableBooks = {
             "the curious incident of the dog in the night-time", "siddhartha", "the book thief",

             "a tale of two cities", "the color purple", "wuthering heights",

             "the diary of a young girl", "the hunger games", "life of pi",

             "the shining", "it", "java",

             "the house on mango street", "the wizard of oz", "the power of now",

             "java", "the importance of being earnest", "the wind in the willows",

             "the lovely bones", "the song of achilles", "the time machine",
    };
    Library(){
        this.totalAvailableBooks  = availableBooks.length;
    }
    void addBook(String... arr) {     // String... arr is for variable arguments
        System.out.println("\n\n Adding books in the Library \n\n");
        int CL = availableBooks.length;
        int newAL = arr.length;
        String[] addArray = new String[CL + newAL];
        // Copy previous books to library
        for (int i = 0; i < CL; i++) {
            addArray[i] = availableBooks[i];
        }
        // Add new books to the library
        for (int i = 0; i < newAL; i++) {
            addArray[CL + i] = arr[i];
        }
        availableBooks = addArray;
        this.totalAvailableBooks += arr.length;
    }

    void issueBook() {
        Scanner scc = new Scanner(System.in);
        System.out.println("Type the No and Name of the books(in small letters) to be issued to you (max 5 books allowed)");
        System.out.print("enter the no of books you want to issue: ");
        int no_of_bookIssue = scc.nextInt();  //when you now hit enter  it does not read it ,but it just read the no you type...for this you this the below
        String[] bookIssue = new String[no_of_bookIssue];

        //adding a new line so enter is read  by it
        scc.nextLine();   //it will read enter

        for (int i = 0; i < no_of_bookIssue; i++) {
            System.out.print("Book" + (i + 1) + ": ");
            bookIssue[i] = scc.nextLine().toLowerCase();    //the left over enter  is read by java so can't type  the first book name for this you do ^^^

        }
        for(String check: bookIssue){
            boolean bookFound = false;
            for (int i = 0; i < availableBooks.length; i++) {
                if (availableBooks[i] != null && availableBooks[i].equals(check)) {
                    availableBooks[i] = null;
                    bookFound = true;
                    this.totalAvailableBooks --;
                    break;
                }
            }
            if(!bookFound) {
                System.out.println(check+"  -> this book does not exist in Library");
            }
        }
    }

    void returnBook() {
        Scanner scc = new Scanner(System.in);
        System.out.println("Type the No and Name of the books (in small letters) to be returned by you (max 5 books allowed)");
        System.out.print("enter the no of books you want to return: ");
        int no_of_booksReturning = scc.nextInt();
        String []bookReturn = new String[no_of_booksReturning];
        //using nextLine for consuming enter
        scc.nextLine();
        // Expand the availableBooks array
        int newLength = availableBooks.length + no_of_booksReturning;
        String[] newArray = new String[newLength];
        // Copy existing books to new array
        for (int i = 0; i < availableBooks.length; i++) {
            newArray[i] = availableBooks[i];
        }

        for (int i = 0; i <no_of_booksReturning;i++){
            System.out.print("Book" + (i+1) + ": ");
            bookReturn[i] = scc.nextLine().toLowerCase();
            //checking if the book already is in the Array or not
            boolean bookCheck = false;
            for (String book:  availableBooks) {
                if(bookReturn[i].equals(book)){
                    System.out.println("this book-" + book+ "-already exist in the Library ");
                    bookCheck = true;
                    break;
                }
            }
            // Add returned books to new array
            if(!bookCheck){
                newArray[availableBooks.length + i] = bookReturn[i];
                this.totalAvailableBooks ++;
            }
        }
        availableBooks = newArray;
    }

    void showAvailableBooks() {
        System.out.println("total " + totalAvailableBooks + " books  are present in the Library");
        for (String book : availableBooks) {
            if (book != null) {
                System.out.println("*" + book.toUpperCase());
            }
        }
    }
}

public class Ex4_library {
    public static void main(String[] args) {
        Library l1 = new Library();
        l1.showAvailableBooks();
        l1.addBook("the alchemist", "little women", "the picture of dorian gray", "dracula", "the grapes of wrath",

                "the thief of always", "the graveyard book", "the perks of being a wallflower",

                "the children of men", "the crucible", "the silver linings playbook"
        );
        l1.showAvailableBooks();
        l1.issueBook();
        l1.showAvailableBooks();
        l1.returnBook();
        l1.showAvailableBooks();

    }
}
