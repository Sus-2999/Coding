import java.util.Scanner;

public class sortRadixLSD {
    
    static int min,max;

    static int digit_number(int var1, int var2) {
        int c=0;
        if(var2<0) {
            var1 -= var2;
        }
        while(var1>0) {
            var1 /= 10;
            c++;
        }
        return c;
    }

    static void radix_LSD(int arr1[], int n) {
        int[] arr2 = new int[n];
        short[] position = new short[10];
        int remainder, i=0, j, b=1;
        if(min<0) {
            for(j=0; j<n; j++)
            {
                arr1[j] -= min;
            }
        }
        while(i < digit_number(max,min)) {
            for(j=0; j<n; j++)
            {
                remainder = (arr1[j]/b)%10;
                ++position[remainder];
            }
            for(j=1; j<10; j++)
			{
			    position[j] += position[j-1];
			}
			for(j=n; j>0; j--)
			{
			    remainder = (arr1[j-1]/b)%10;
				arr2[--position[remainder]] = arr1[j-1];
			}
			for(j=0; j<n; j++)
			{
				arr1[j] = arr2[j];
			}
			for(j=0; j<10; j++)
			{
				position[j] = 0;
			}
            b *= 10;
			i++;
        }
        if(min<0) {
            for(j=0; j<n; j++)
            {
                arr1[j] += min;
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num,i,j,k,found=0;

        System.out.printf("THIS IS A PROGRAM TO RADIX SORT A LIST OF INTEGERS\n\n");
        System.out.print("Enter the number of integers you want to store (min. 10 and max. 100): ");
        num = input.nextInt();
        if(num<10 || num>100)
        System.out.print("Cannot store such number of integers.");
        else {
            int[] A = new int[num];
            System.out.println("Enter the values of "+ num +" integers below (Value should lie between -1,073,741,823 and 1,073,741,823) -->");
            for(j=0; j<num; j++)
            {
                A[j] = input.nextInt();
            }
            input.close();
            for(i=0; i<num; i++)
            {
                if(A[i] < -1073741824 || A[i] > 1073741823)
                found = 1;
            }
            if(found==1)
            System.out.print("Program cannot be executed because integer stored is out of stipulated range.");
            else if(found==0) {
                i=0;
                j=0;
                for(k=i+1; k<num; k++)
                {
                    if(A[i] > A[k])
                    i = k;
                }
                min = A[i];
                for(k=j+1; k<num; k++)
                {
                    if(A[j] < A[k])
                    j = k;
                }
                max = A[j];
                radix_LSD(A, num);
                System.out.println("List of integers stored in ascending order are:");
                for(i=0; i<num; i++)
                {
                    System.out.print(" "+ A[i]);
                }
            }
        }
    }
}