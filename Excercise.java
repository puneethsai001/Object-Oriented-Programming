import java.util.Scanner;
import java.util.Arrays;

public class Excercise {
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);
        
        System.out.print("Enter no of items: ");
        int num = sobj.nextInt();
        
        double items[] = new double[num];
        double price = 0;

        for (int i = 0; i < num; i++){
            System.out.print("Enter item price: ");
            items[i] = sobj.nextDouble();
            price += items[i];
        }

        Arrays.sort(items);

        if(num >= 3){
            price = price - items[0];
            System.out.println("Price after discount is: "+price);
        }

        else if (num < 3 && price >= 500){
            price = price - ((price/100)*33);
            System.out.println("Price after 33% discount is: "+price);
        }

        else
            System.out.println("No discount, price is: "+price);

        sobj.close();
    }
}
