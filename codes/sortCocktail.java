import java.util.Scanner;

public class sortCocktail {
    
    static void cocktail_sort(int arr[], int n) {
        int temp, i=0, j=n-1, k;
        while(i<j)
	    {
		    for(k=i+1; k<=j; k++)
		    {
			    if(arr[k-1] < arr[k])
			    {
				    temp = arr[k-1];
				    arr[k-1] = arr[k];
				    arr[k] = temp;
			    }
		    }
		    for(k=j-1; k>=i+1; k--)
		    {
			    if(arr[k-1] < arr[k])
			    {
				    temp = arr[k-1];
				    arr[k-1] = arr[k];
				    arr[k] = temp;
			    }
		    }
		    ++i;
		    --j;
	    }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, i;

        System.out.printf("THIS IS A PROGRAM TO COCKTAIL SORT A LIST OF INTEGERS\n\n");
        System.out.print("Enter the number of integers you want to store (min. 10 and max. 100): ");
        num = input.nextInt();
        if(num<10 || num>100)
        System.out.print("Cannot store such number of integers.");
        else {
            int[] A = new int[num];
            System.out.println("Enter the values of "+ num +" integers below (Value should lie between -2,147,483,648 and 2,147,483,647) -->");
            for(i=0; i<num; i++)
            {
                A[i] = input.nextInt();
            }
            input.close();
            cocktail_sort(A, num);
            System.out.printf("\n\nDescending order of all integers stored =\n");
            for(i=0; i<num; i++)
            {
                System.out.print(" "+ A[i]);
            }
        }
    }
}