import java.util.Scanner;
public class TotalMarksCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your English marks:");
        int eng = input.nextInt();

        System.out.println("Enter your Chemistry marks:");
        int chem = input.nextInt();

        System.out.println("Enter your Math marks:");
        int math = input.nextInt();

        System.out.println("Enter your Biology marks:");
        int bio = input.nextInt();

        System.out.println("Enter your Physics marks:");
        int physics = input.nextInt();

        float percentage = ((eng+chem+math+bio+physics)/500.0f)*100;
        System.out.println("Percentage: "+percentage);

        input.close();
    }
}
