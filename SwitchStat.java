import java.util.Scanner;
public class SwitchStat {


    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        System.out.println("enter another number");
        int num2 = sc.nextInt();
        return num+num2;


    }
    public static void main(String[] args) {
     
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter a day value");
        // int day = sc.nextInt();

        // switch(day){
        //     case 1 -> System.out.println("monday");
        //     case 2 -> System.out.println("tuesday");
        //     case 3 -> System.out.println("wednesday");
        //     case 4 -> System.out.println("thrusday");
        //     case 5 -> System.out.println("friday");
        //     case 6 -> System.out.println("saturday");
        //     case 7 -> System.out.println("sunday");

        // }
        // sc.close();
        System.out.println(sum());
    }
}
