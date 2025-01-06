class Library1{    //name must be start with capital
    public int  no_of_books;
    String[] books ;
    Library1(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String b){
        this.books[no_of_books] = b;
        no_of_books++;
        System.out.println( b +" ->the book has been added");
    }
    void showAvailableBook(){
        System.out.println("the available books are: ");
        for (String book: this.books){
            if(book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issueBook(String b){
        for(int i=0; i<this.books.length; i++){
            if(this.books[i] != null && this.books[i].equals(b)){     // never use any function on null ... if fn perform to null this wil throw a null pointer exception
                System.out.println(b + " this book has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println(b + " ->this book does not exist");
    }
    void returnBook (String c){
        addBook(c);
    }
}
public class Ex4_library_simple {
    public static void main(String[] args) {
        Library1 centrallibrary = new Library1();
        centrallibrary.showAvailableBook();
        centrallibrary.addBook("Rich dad Poor dad");
        centrallibrary.addBook("Mind");
        centrallibrary.addBook("Shrimad Bhagwad Geeta");
        centrallibrary.addBook("The Unloved Heart");
        centrallibrary.addBook("hypothesis");
        centrallibrary.addBook("Algo");
        centrallibrary.addBook("C++");
        centrallibrary.showAvailableBook();
        centrallibrary.issueBook("Rich dad Poor dad");
        centrallibrary.issueBook("hypothesis");
        centrallibrary.issueBook("C++");
        centrallibrary.issueBook("Java");
        centrallibrary.showAvailableBook();
        centrallibrary.returnBook("C++");
        centrallibrary.returnBook("hypothesis");
        centrallibrary.showAvailableBook();

    }
}
