import java.util.Scanner;

public class operatorMax {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int A,B;
        System.out.printf("Enter the value of two integers A and B below:\n");
        System.out.print("A = ");
        A = scan.nextInt();
        System.out.printf("B = ");
        B = scan.nextInt();
        scan.close();
        System.out.println("");
        char op = select_operator(A,B);
        System.out.print("For the operator "+op+", the value of A"+op+"B is maximum");
    }

    static char select_operator(int x, int y) {
        int max=x+y;
        char OP = '+';
        if(max < x-y) {
            OP = '-';
            max = x-y;
        }
        if(max < x/y) {
            OP = '/';
            max = x/y;
        }
        if(max < x*y)
            OP = '*';
        return OP;
    }
}