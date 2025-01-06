import java.util.Scanner;

public class Ex1_input_taking_PR {
    public static void main(String[] args) {
       System.out.println("Class 12th marks and percentage");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maths_marks:");
        //int a = sc.nextInt(); can be used
        float a = sc.nextFloat();
        System.out.println("Enter phy_marks:");
        float b = sc.nextFloat();
        System.out.println("Enter chem_marks:");
        float c = sc.nextFloat();
        System.out.println("Enter eng_marks:");
        //int d = sc.nextInt();
        float d = sc.nextFloat();
        System.out.println("enter phe_marks:");
        float e = sc.nextFloat();
        System.out.println("total marks in all subject(i.e. 500,200): ");
        float t = sc.nextFloat();
        float sum = a+b+c+d+e;
        System.out.print("Total marks: ");
        System.out.println(sum);
        float percentage = 100*sum/t;
        System.out.print("percentage in 12th: ");
        System.out.println(percentage);
        System.out.print("total pcm marks obtained: ");
        System.out.println(a+b+c);
        System.out.println("total pcm marks");
        float s = sc.nextFloat();
        System.out.println("enter pcm marks obtained");
        float pcm_percent = sc.nextFloat();
        float z = 100*pcm_percent/s;
        System.out.println(z);
        //for checking any true false code that user input is correctly given use....
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);

    }
}
