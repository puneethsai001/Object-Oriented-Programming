//final
final class A{
    int x;
    final void display(){
        System.out.println("This is from class A");
    }
}

public class oop1 {
    public static void main(String[] args) {
        A a1 = new A();
        a1.x = 1;
        a1.display();

    }
}
