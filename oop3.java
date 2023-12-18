//abstract word

abstract class TestA{
    int x;
    abstract void area();
}

class TestB extends TestA{
    int y;
    void area(){
        System.out.println(3.14*3*3);
    }
}

class TestC extends TestA{
    int z;
    void area(){
        System.out.println(3*3);
    }
}

public class oop3 {
    public static void main(String[] args) {
        TestC b = new TestC();
        b.area();
    }
}