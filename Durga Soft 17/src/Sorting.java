import java.util.Arrays;
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {90,89,32,1,2};
		System.out.println("Original Array: " + Arrays.toString(array));
		
		Sorting.selectionsort(array);
		System.out.println("Sorted  Array: " + Arrays.toString(array));

	}
	static void selectionsort(int[]arr) {
		int n=arr.length;
		for(int i=0;  i<n-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<n; j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
		
	}

}
