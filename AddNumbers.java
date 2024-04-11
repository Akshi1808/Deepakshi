import java.lang.System;
import java.util.Scanner; // importing scaaner
public class AddNumbers {
        public static void main(String[] args) {
            System.out.print("Taking numbers for adding.\n");

            int a, b, c, d;

            Scanner myObj = new Scanner(System.in); //creating scanner as object
            System.out.println("Enter first number: ");  //taking first number
            a = myObj.nextInt();                         // storing

            System.out.println("Enter Second number: ");
            b = myObj.nextInt();

            System.out.println("Enter Third number: ");
            c = myObj.nextInt();

            myObj.close();
            d = a + b + c;
            System.out.println("output after addition: " + d);
        }

}
