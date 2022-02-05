package f_array_class;

import java.util.Arrays;

public class A_array_class {

	public static void main(String[] args) {
		
		int[] a = {5,8,1,4,3,6,7};
//		for(int i = 0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
		
// sorting
		Arrays.sort(a);
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		
// binary search	
		int index = Arrays.binarySearch(a, 5);
		System.out.println("Index of number 5 is : " + index);
		
//fill
		Arrays.fill(a, 1);
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
