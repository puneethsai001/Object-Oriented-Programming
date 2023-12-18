import java.util.Scanner;

class MyException extends Exception{
    MyException(String str){
        super(str);
        System.out.println(str);
    }
}

public class oop7 {
    public static void main(String[] args) {
        int x;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        s.close();

        if (x < 18){
            try{
                throw new MyException("Age below 18");
            }

            catch (MyException e){
                System.out.println("Done");
            }
        }

        else{
            System.out.println("Success");
        }
    }
}