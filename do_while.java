import java.util.Scanner;
public class do_while {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any natural number: ");
        int num = sc.nextInt();

        int i = 1;
        do{                                                   
            System.out.println(i);
            i+=9;
        }while(i<=num);                            
        
// do {
//     // Code to be executed at least once
// } while (condition);
    

// --------------------------------------------------------------------------------------------------

        int j = 1;
        while(j<=num)
        {
            System.out.println(j);
            j++;                                        // while
        }


// while (condition) {
//     // Code to be executed as long as the condition is true
// }

    }
}
