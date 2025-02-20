import java.util.ArrayList;
class book{
     String bookname,author,issued_To,issued_On;
     book(String name,String author){
        this.bookname = name;
        this.author = author;
        this.issued_To = "no one";
    }
}
class MyLibrary{
    ArrayList<book> books = new ArrayList<>();
    MyLibrary(){
        books.add(new book("the fisherman","Aman"));
        books.add(new book("the fish","Sakshi"));
    }
    public void addbook(String b,String a){
        this.books.add(new book(b,a));
        System.out.println("book added successfully");
    }
     public void issue_book(String name,String issue_to){
        for (book ele: this.books){
            if(ele.bookname.equalsIgnoreCase(name)){
                ele.issued_To = issue_to;
                System.out.println("the book is issued");
                this.books.remove(ele);
                return;
            }
        }
         System.out.println("book not available or issued already");
    }
    public void return_book(String name,String author){
        this.books.add(new book(name,author));
        System.out.println("book returned");
    }
    public void displaybook(){
         for (book e:this.books){
             System.out.println("name:" + e.bookname+" author:" + e.author+" issued to:" + e.issued_To);
         }
    }
}


public class Ex7_library_management {
    public static void main(String[] args) {
        MyLibrary l = new MyLibrary();
        l.displaybook();
        l.addbook("the harry","harry");
        l.addbook("the anna","anna");
        l.addbook("the peri","peri");
        l.displaybook();
        l.issue_book("the harry","aman ji");
        l.issue_book("the fish","sakshi ji");
        l.displaybook();
        l.return_book("the fish","Sakshi");
        l.return_book("the harry","harry");
        l.displaybook();



    }
}
