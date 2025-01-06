import java.util.Random;
import java.util.Scanner;
public class Ex2_ch4_ROCK_SCC_PAPER_PR {
    public static void main(String[] args){
        //making of rock paper scissors
        System.out.println("hello Guzs");

        Scanner z = new Scanner(System.in);
        Random rand = new Random();
        //inserting loop
        int loop = 1;
        while(loop<= 7){
            loop++;
            
        System.out.print("Your turn(choose 0,1,2 for rock,paper,scissor respectively: ");
        int p1 = z.nextInt();

        System.out.print("Computer choose: ");
        int a = rand.nextInt(0,3);


        switch(a){
            case 0 -> System.out.println("rock");
            case 1 -> System.out.println("paper");
            case 2 -> System.out.println("scissor");
        }
        if(p1==a){
            System.out.println("it's a tie \n\t\t try again ");
        }
         else if((p1==0 && a==1) || (p1==1 && a==2) || (p1==2 && a==0)){
            System.out.println("computer won!! \n\t\t try again");
        }
        else if((p1==0 && a==2) || (p1==1 && a==0) || (p1==2 && a==1)){
            System.out.println("You Won!! \n\t\t congrats");
        }
        else {
            System.out.println("WARNING!! \n\t\t Your input is a wrong number");
        }
        }
    }
}
