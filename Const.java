public class Const {
    int age;
    String name;


    public Const(int age,String name){
    this.age  = age;
    this.name = name;
}

void display(){
    System.out.println("name is "+this.name+" and age is "+this.age);
}
public static void main(String[] args) {
    Const c1 = new Const(21, "sahil");
    c1.display();
}
}
