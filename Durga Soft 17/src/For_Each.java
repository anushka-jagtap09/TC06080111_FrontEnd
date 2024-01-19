
public class For_Each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array is printed by the normal for loop
		
//		int[] x = {10,2,30,40};
//		for(int i =0; i<x.length; i++) {
//			System.out.println(x[i]);
//		}
//		
		
		//Array is printed by fro each loop
//		int [] x= {12,3,44,5,3};
//		for(int x1:x) {
//			System.out.println("This all the element of the array"+" "+x1);
//			
//		}

		
		//Print the element of the 2d array
		
		int [][] x= {{10,20,30,40},{50,60}};
//		for(int i=0; i<x.length; i++) {
//			for(int j=0; j<x[i].length; j++) {
//				System.out.println("This all the element of the array"+" "+x[i][j]);
//				
//			}
//		}
		
		for(int[] x1:x) {
			for(int x2:x1) {
				System.out.println("This all the element of the array"+" "+x2);
				
			}
		}
		
	}

}
