import java.util.Scanner;
public class Input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter value of A: ");
        // int a = sc.nextInt();

        // System.out.println("Enter value of B: ");
        // int b = sc.nextInt();

        // System.out.println("The sum of A and B is: "+(a+b));
        // System.out.println(a+b);

        System.out.println("enter integer number");
        System.out.println("is number a integer?");
        boolean c = sc.hasNextInt();
        System.out.println(c);

        // String d = sc.nextLine();         suppose the input is "sahil is a good boy" and i want to print only 1st letter of the inputed string then we use sc.next(); to print it 
        // String d = sc.nextLine();            suppose the input is "sahil is a good boy" and i want to print the inputed whole string then we use sc.nextLine(); to print it 
        // System.out.println(d);

        
        sc.close();                           // to closee the Scanner method
    }
}