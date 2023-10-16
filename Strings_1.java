import java.util.Scanner;
public class Strings_1
{
    public static void main(String[] args) {
        
        // String name = new String("sahil");        //this is one of the way to create a String 
        // System.out.println(name);
        // String name1 = "harry";               // this is the 2nd way and easy way to create a string.
        // System.out.println(name1);

        Scanner input = new Scanner(System.in);
        // String st = input.nextLine();
        String st = input.next();
        System.out.println(st);

        input.close();
    }
}