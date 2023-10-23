
public class Const_Overloading {
    Const_Overloading(String name){

        System.out.println("Constructor with one argument "+name);
    }

    Const_Overloading(String name,int age){

        System.out.println("Constructor with two arguments "+name+" "+age);
    }

    Const_Overloading(long number){
        System.out.println("Constuctor with one argument "+number);
    }

    Const_Overloading(){
        System.out.println("end of constructor?");
    }


    public static void main(String[] args) {
        
        new Const_Overloading("sahil");
        new Const_Overloading("sahil", 67);
        new Const_Overloading(123456789);
        new Const_Overloading();
    }
}
