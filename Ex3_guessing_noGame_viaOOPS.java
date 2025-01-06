import java.util.Scanner;
import java.util.Random;

class Game{

    public int guessno;
    public int userinput;
    public int noOfGuesses = 0;

//    public int getNoOfGuesses() {                    ..these are just extra
//        return noOfGuesses;
//    }
//
//    public void setNoOfGuesses(int noOfGuesses) {
//        this.noOfGuesses = noOfGuesses;
//    }

    public Game() {      //can use nothing in place  of public during creating the constructor
        Random rand = new Random();
        guessno = rand.nextInt(100, 201);
    }
    void takeUserInput () {
        System.out.print("guess the correct number: ");
        Scanner sc = new Scanner(System.in);
        userinput = sc.nextInt();
    }
    boolean isCorrectNo(){
        noOfGuesses ++;
        if(userinput==guessno){
            System.out.println("Well done bro!! you guesses it right ...\n you are just a fantastic guesser \t\t !!!you should try your luck in casino!!!");
            System.out.printf("you guesses it in %d attempts only" , noOfGuesses);
            return true;
        }
        else if (userinput<guessno){
            System.out.println("no is bigger");
        }
        else if (userinput>guessno){
            System.out.println("no is smaller");
        }
        return false;
    }
}


public class Ex3_guessing_noGame_viaOOPS {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b) {    //this loop run as long as b is false
            g.takeUserInput();
            b = g.isCorrectNo();
        }




    }
}
