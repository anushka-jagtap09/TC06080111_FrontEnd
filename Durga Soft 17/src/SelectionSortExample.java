import java.util.Arrays;
public class SelectionSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,70,65,32};
		System.out.println("The orignal array" +Arrays.toString(array));
		
		
		SelectionSortExample.selection(array);
		System.out.println("The sorted array" +Arrays.toString(array));
		

	}
	
	static void selection(int[] arr) {
		int n=arr.length;
		for(int i=0; i<n-1; i++) {
			int minIndex=i;
			
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[minIndex]);
				minIndex=j;
				
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
			
		}	
	}

}


