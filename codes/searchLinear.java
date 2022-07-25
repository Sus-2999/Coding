import java.util.Scanner;

public class searchLinear {

    static int search(int A[], int n, int x) {
        int i;
        for(i=0; i<n; i++)
        {
            if(A[i]==x)
            return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        int j, result;
        byte num, i;
        
        System.out.print("Enter the number of integers you want to store (min. 10 and max. 50): ");
        num = input.nextByte();
        if(num<10 || num>50)
        System.out.println("Cannot store such number of integers.");
        else {
            int[] array = new int[num];
            System.out.println("Enter the values of "+ num +" integers below -->");
            for(i=0; i<num; i++)
            {
                array[i] = input.nextInt();
            }
            System.out.print("Enter the value of the element you want to search: ");
            j = input.nextInt();
            input.close();
            result = search(array, num, j);
            if(result==-1)
            System.out.print(j +" integer not found.");
            else
            System.out.print(j +" integer found at index "+ result);
        }
    }
}