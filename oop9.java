//Multi-Threading
class A extends Thread{
    public void run(){
        for (int i = 1; i <= 50; i++){
            System.out.println("Running from class A. Value of i is: "+ i);
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 1; i <= 50; i++){
            System.out.println("Running from class B. Value of i is: "+ i);
        }
    }
}

class C extends Thread{
    public void run(){
        for (int i = 1; i <= 50; i++){
            try{
                if (i == 20){
                sleep(3000);
                }
            }
            catch (InterruptedException e){}
            System.out.println("Running from class C. Value of i is: "+ i);
        }
    }
}

public class oop9{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        c.setPriority(Thread.MAX_PRIORITY);
        a.setPriority(Thread.MIN_PRIORITY);

        a.start();
        b.start();
        c.start();
    }
}