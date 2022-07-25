public class dupUnique {
	public static void main(String[] args) {
		int[] a={1,3,6,5,4,3,7,9,5,6,1,2,3,7,4,6};
		int i,j;
		int unique=0;
		int max=a[0];
		display(a);
		
		// Finding max among elements
		for(i=0;i<a.length; i++) {
			if(max<a[i])
			max=a[i];
		}
		
		int[] x = new int[max+1];
		for(i=0; i<=max; i++) {
			for(j=0; j<a.length; j++) {
				if(i==a[j])
	   			x[i]++;
			}
		}
		
		//counting the uniques
		for(i=0;i<max+1; i++) {
			if(x[i]==1)
			unique++;
		}
		System.out.println("");
		System.out.println("Unique elements = "+unique);
		System.out.println("Duplicate elements = " +(max-unique));
	}
	
	static void display(int[] a) {
		int i;
		for(i=0;i<a.length; i++) {
			System.out.printf("%d ", a[i]);
		}
		System.out.println(" ");
	}
}