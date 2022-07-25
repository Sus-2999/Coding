import java.math.BigInteger;
import java.util.Scanner;

public class bigInteger {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BigInteger fact = BigInteger.valueOf(1);
        int X;

        System.out.printf("THIS IS A PROGRAM TO CALCULATE AND PRINT FACTORIAL OF INTEGERS GREATER THAN 20\n\n");
        while(true) {
            System.out.print("Enter an integer value greater than 20: ");
            X = scan.nextInt();
            if(X<=20) System.out.printf("Integer input is less than or equal to 20. Try again.\n\n");
            else {
                scan.close();
                break;
            }
        }
        for(int i=2; i<=X; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial of ");
        System.out.print(X+" = "+fact);
    }
}