import java.util.Scanner;
public class IF_Else {
    public static void main(String[] args) {
        int m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your physics marks: ");
        m1 = sc.nextInt();

        System.out.println("enter your chemistry marks: ");
        m2 = sc.nextInt();

        System.out.println("enter your math marks: ");
        m3 = sc.nextInt();

        float avg = (m1+m2+m3)/3.0f;
        
        if(avg>=40  &&  m1>35  &&  m2>35  &&  m3>35)
        {
            System.out.println("pass");
            float per = (avg/100)*100;
            System.out.println("and your percentage is: "+per);
        }
        else{
            System.out.println("fail");
            float per = (avg/100)*100;
            System.out.println("and your percentage is: "+per);
        }
        sc.close();
    }
}
