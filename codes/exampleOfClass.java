import java.util.Scanner;

class Expression {
    int a,b;
    Expression(int A, int B){
        this.a = A;
        this.b = B;
    }
    int Sum(){
        return a+b;
    }
    int Difference(){
        return a-b;
    }
    int Product(){
        return a*b;
    }
    float Quotient(){
        return (float)a/b;
    }
    int Remainder(){
        return a%b;
    }
}

public class exampleOfClass {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int X, Y;

        System.out.println("Enter two integer values below:");
        X = input.nextInt();
        Y = input.nextInt();
        input.close();
        Expression func = new Expression(X, Y);
        System.out.println(X+" + "+Y+" = "+func.Sum());
        System.out.println(X+" - "+Y+" = "+func.Difference());
        System.out.println(X+" * "+Y+" = "+func.Product());
        System.out.println("Quotient when "+X+" is divided by "+Y+" that is, "+X+"/"+Y+" = "+func.Quotient());
        System.out.print("Remainder when "+X+" is divided by "+Y+" that is, "+X+"%"+Y+" = "+func.Remainder());
    }
}