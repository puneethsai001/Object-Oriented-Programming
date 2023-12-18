//Test Exception
import java.util.Scanner;

public class oop6{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x,y;
        System.out.print("Enter 2 numbers: ");
        x = s.nextInt();
        y = s.nextInt();

        try{
            System.out.println(x/y);
        }
        catch(ArithmeticException e){
            System.out.print("Enter y value again: ");
            y = s.nextInt();
            System.out.println(x/y);
        }

        finally{
            System.out.println("Done");
        }

        s.close();
    }
}