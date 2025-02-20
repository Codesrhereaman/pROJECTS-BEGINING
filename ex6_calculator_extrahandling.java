import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidInputException extends InputMismatchException{
    @Override
    public String toString() {
        return "Invalid input given";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Input can't be greater than 1,00,000 in this calculator";
    }
}
class Divisionby0 extends Exception{
    @Override
    public String toString() {
        return "Division by 0 is not valid";
    }
}

class MaxMultiplierReachedException extends Exception{
    @Override
    public String toString() {
        return "Multiplication input can't be bigger than 7000 in this calculator";
    }
}
public class ex6_calculator_extrahandling {
    //declaration of scanner object & num1,num2. globally
    public static Scanner sc = new Scanner(System.in);
    static int num1=0,num2=0;
    static char ch;

    public static int inp1() throws MaxInputException,InvalidInputException{
        System.out.print("Enter number 1: ");
        if(!sc.hasNextInt()){
            throw new InvalidInputException();
        }
        else {
            num1 = sc.nextInt();
        }
        if (num1>=100000){
            throw new MaxInputException();
        }
        return num1;
    }
    public static char Taking_Operator() throws InvalidInputException{
        System.out.println("Enter the operator:\n+ --> addition\n- --> subtraction\n* --> multiplication\n/ --> division");
        ch =  sc.next().charAt(0);
        if (ch != '+' && ch != '-'&& ch != '*'&& ch != '/'){
            throw new InvalidInputException();
        }
        return ch;
    }
    public static int inp2() throws MaxInputException,InvalidInputException{
        System.out.print("Enter number 2: ");
        if(!sc.hasNextInt()){
            throw new InvalidInputException();
        }
        else {
            num2 = sc.nextInt();
        }
        if (num2>=100000){
            throw new MaxInputException();
        }
        return num2;
    }
    public static void addition(int a ,int b){
        System.out.println("Sum = " + (a+b));
    }
    public static void subtraction(int a ,int b){
        System.out.println("Difference = " + (a-b));
    }
    public static void multiplication (int a ,int b)throws MaxMultiplierReachedException{
        if(a>=7000 || b >=7000){
            throw new MaxMultiplierReachedException();
        }
        System.out.println("product = " + (a*b));
    }
    public static void division(int a ,int b) throws Divisionby0{
        if (b==0){
            throw new Divisionby0();
        }
        System.out.printf("Division = %.3f" , ((float)a/b));
    }

    //main function starts

    public static void main(String[] args) {

        try {
            num1 = inp1();
            ch = Taking_Operator();
            num2 = inp2();
        } catch (MaxInputException | InvalidInputException e1) {
            System.out.println("Error: " + e1);
        }
        switch (ch) {
            case '+' -> addition(num1, num2);
            case '-' -> subtraction(num1, num2);
            case '*' -> {
                try {
                    multiplication(num1, num2);
                } catch (MaxMultiplierReachedException m3) {
                    System.out.println("Error: " + m3);
                }
            }
            case '/' -> {
                try {
                    division(num1, num2);
                } catch (Divisionby0 m4) {
                    System.out.println("Error: " + m4);
                }
            }
        }
    }
}