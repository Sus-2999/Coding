import java.lang.Math;
import java.util.Scanner;

public class randomMath {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Math.random() generates a double value in the interval [0,1)
        System.out.print("A random real number between 0 and 1 = "+ Math.random());
        System.out.printf("\nEnter two integral values below to generate a random real number in that range\n");
        System.out.printf("\nEnter the first number: ");
        int min = sc.nextInt();
        System.out.printf("\nEnter the second number: ");
        int max = sc.nextInt();
        sc.close();
        System.out.printf("\nRandom real number between %d and %d = %f", min, max, Math.random()*(max-min+1)+min);
    }
}
