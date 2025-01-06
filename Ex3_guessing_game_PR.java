import java.util.Scanner;
import java.util.Random;
public class Ex3_guessing_game_PR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int g1 = rand.nextInt(1,101);
        int c = 1;
        boolean  gc = false;
        while(c<=7){
            c++;
            System.out.print("Enter ur guessed number(btw 1 to 100): ");
            int u1 = sc.nextInt();
        if(u1==g1){
            System.out.println("correct number is guessed: " + g1);
            gc = true;
            break;
        }
        else if(g1<u1){
            System.out.println("no is smaller than this \n\t try again");
        }
        else {
            System.out.println("no is bigger than this \n\t try again");
        }
        }
        if(!gc) {
            System.out.println("Your attempts are over \n the original number is: " + g1);
        }

    }
}
