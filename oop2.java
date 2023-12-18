/* Write a program in java to display product information with productid, product name, cost price, selling price, 
quantity sold and calculate the total amount recieved and calculate the profit gained for that product. Use OOPs 
priciples and scanner class for inputs */

import java.util.Scanner;

class product{
    int productid;
    String productname;
    float cp;
    float sp;
    float qty;

    void profit(){
        System.out.println("Net Profit: "+ qty*(sp - cp));
    }

    void amount_info(){
        System.out.println("Net Amount Paid: "+ qty*cp);
        System.out.println("Net Amount Recieved: "+ qty*sp);
    }
}

public class oop2 {
    public static void main(String[] args) {

        product p1 = new product();
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        p1.productid = sobj.nextInt();

        System.out.print("Enter Product Name: ");
        p1.productname = sobj.next();

        System.out.print("Enter Cost Price: ");
        p1.cp = sobj.nextFloat();

        System.out.print("Enter Selling Price: ");
        p1.sp = sobj.nextFloat();

        System.out.print("Enter Quanitity: ");
        p1.qty = sobj.nextFloat();

        p1.amount_info();
        p1.profit();

        sobj.close();

    }
}