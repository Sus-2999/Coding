import java.util.Scanner;

public class sortExchange {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num,i;

        System.out.print("Enter the number of integers you want to store (min. 10 and max. 100): ");
        num = input.nextInt();
        if(num<10 || num>100)
        System.out.print("Cannot store such number of integers.");
        else {
            int[] A = new int[num];
            System.out.println("Enter the values of "+ num +" integers below (Value should be between -2,147,483,648 and 2,147,483,647) -->");
            for(i=0; i<num; i++)
            {
                A[i] = input.nextInt();
            }
            input.close();
            System.out.println("List of integers stored:");
            for(i=0; i<num; i++)
            {
                System.out.print(" "+ A[i]);
            }
            exchange_sort(A,num);
            System.out.printf("\n\nList of integers in ascending order is as follows:");
            for(i=0; i<num; i++)
            {
                System.out.print(" "+ A[i]);
            }
        }
    }

    static void exchange_sort(int arr[], int n) {
        int j,k,temp;
        for(j=0; j<n-1; j++)
        {
            for(k=j+1; k<n; k++)
            {
                if(arr[j] > arr[k])
                {
                    temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }
    }
}