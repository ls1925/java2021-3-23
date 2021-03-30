package bag;

import java.util.Scanner;

public class Structrue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your length :");
        int length = Integer.parseInt(scan.next());
        System.out.println("Please input your width :");
        int width = Integer.parseInt(scan.next());
        System.out.println("Please input your height :");
        int height = Integer.parseInt(scan.next());
        System.out.println(" length " + length +" width " + width+" height "+ height);
        if(length <= 10 && width <= 10 && height <= 10 ){
            System.out.println("Box 3, price: 60");
        } else if (length <10 && width <= 20 && height <= 20) {
            System.out.println("Box 5, price: 90");
        }
    }
}
