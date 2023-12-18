//interface

interface myface{
    public void display();
    public void area();
}

class A{
    int x;
    void show(){
        System.out.println("Hello World!!");
    }
}

class B extends A implements myface{
    public void display(){
        System.out.println("Display!!");
    }
    public void area(){
        System.out.println("Area !!");
    }
}

public class oop4 {
    public static void main(String[] args) {
        B b = new B();
        b.display();
        b.area();
        b.show();  
    }
}
