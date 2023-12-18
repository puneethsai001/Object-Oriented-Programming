class TestThrows{
    int x;
    void display() throws ArithmeticException{
        System.out.println(3/0);
    }
}

public class oop8 {
    public static void main(String[] args) {
        TestThrows t = new TestThrows();
        try{
            t.display();
        }
        catch (ArithmeticException e){
            System.out.println("Cant divide by 0");
        }
    }
}
//throws will tell the method that an exception may occur
