//import java.util.Scanner;
//class InvalidInputException extends Exception{
//    @Override
//    public String toString() {
//        return "Invalid input given";
//    }
//}
//class Divisionby0 extends Exception{
//    @Override
//    public String toString() {
//        return "Division by 0 is not valid";
//    }
//}
//class MaxInputException extends Exception{
//    @Override
//    public String toString() {
//        return "Input can't be greater than 1,00,000 in this calculator";
//    }
//}
//class MaxMultiplierReachedException extends Exception{
//    @Override
//    public String toString() {
//        return "Multiplication input can't be bigger than 7000";
//    }
//}
//public class ex6_CALCULATOR {
//    public static void addition(int a ,int b){
//        System.out.println(a+b);
//    }
//    public static void subtraction(int a ,int b){
//        System.out.println(a-b);
//    }
//    public static void multiplication (int a ,int b)throws MaxMultiplierReachedException{
//        if(a==7000 || b ==7000){
//            throw new MaxMultiplierReachedException();
//        }
//        System.out.println(a*b);
//    }
//    public static void division(int a ,int b) throws Divisionby0{
//        if (b==0){
//            throw new Divisionby0();
//        }
//        System.out.println(a/b);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter number 1: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter the operator:\n+ --> addition\n- --> subtraction\n* --> multiplication\n/ --> division");
//        char ch = sc.next().charAt(0);
//        System.out.print("Enter number 2: ");
//        int num2 = sc.nextInt();
//        if(num1>100000 || num2>100000){
//            try{
//                throw new MaxInputException();
//            }
//            catch(MaxInputException m){
//                System.out.println(m.toString());
//                return;
//            }
//        }
//        switch (ch){
//            case '+' -> addition(num1,num2);
//            case '-' -> subtraction(num1,num2);
//            case '*' ->
//            {
//                try{
//                    multiplication(num1,num2);
//                }
//                catch(MaxMultiplierReachedException m3){
//                    System.out.println(m3.toString());
//                }
//            }
//            case '/' ->
//            {
//                try{
//                    division(num1,num2);
//                }
//                catch(Divisionby0 m4){
//                    System.out.println(m4.toString());
//                }
//            }
//        }
//
//    }
//}