public class StaticMethod {

     

    static int logic(int x,int y){  // this is a static method. It can be called without creating object.
        int z;
        z = 3*x+y;
        return z;
    }

    int logic1(double m,double n){    // normal function which needs creation of object.
        double o;
        o = Math.pow(m, n);
        return (int)o;
    }


    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        int c;
        c = logic(a, b);               // static method call
        System.out.println(c);         // static method print without creating object

        StaticMethod obj = new StaticMethod();
        System.out.println(obj.logic1(a, b));      // needs obj to print results.
        StaticMethod obj1 = new StaticMethod();
        

    }
}
