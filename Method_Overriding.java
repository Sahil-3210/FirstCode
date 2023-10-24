class Test{
    void display(){
        System.out.println("Good Morining.");
    }

}

public class Method_Overriding extends Test {
    
    void display(){
        System.out.println("Good Evening.");
    }
        public static void main(String[] args) {
            
        Method_Overriding o1 = new Method_Overriding();
        o1.display();
    }
    
}
