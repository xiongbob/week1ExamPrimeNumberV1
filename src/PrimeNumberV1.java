/*
 Write an application that will show the number and indicate whether or not it is prime for Option 1.
 */
import java.util.Scanner;

public class PrimeNumberV1 {
    public static void main(String args[]){
        int i,m=0,flag=0;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = myObj.nextInt(); //it is the input number to be checked

        while (true) {
            m = n / 2;
            if (n == 0 || n == 1) {
                System.out.println(n + " is not prime number");
            } else {
                for (i = 2; i <= m; i++) {
                    if (n % i == 0) {
                        System.out.println(n + " is not prime number");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(n + " is prime number");
                }
            }
            System.out.println("Do you want to enter another number (Y/N)?");
            char keyboard = myObj.next().charAt(0);

            if (keyboard =='Y' || keyboard =='y') {
                System.out.println("Enter another number: ");
                int nextN = myObj.nextInt();
                n = nextN;
            }
            else if (keyboard =='N' || keyboard =='n') {
                System.out.println("End the game!");
                break;
            }
            else {
                System.out.println("Any improvement?");
            }
        }
    }
}
