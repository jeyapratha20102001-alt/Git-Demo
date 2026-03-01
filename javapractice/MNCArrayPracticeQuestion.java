package javapractice;

import java.util.Arrays;
import java.util.Iterator;

public class MNCArrayPracticeQuestion {
	public static void main(String[] args) {

		// Array Initialize
		/*
		 * int[] arr=new int[5]; arr[0]=10; arr[1]=40; arr[2]=50; arr[3]=45; arr[4]=53;
		 * System.out.println(arr[2]);
		 */

		// Another Direct Way
		/*
		 * int[] arr1= {10,20,46,87,54}; for (int i = 0; i < arr1.length; i++) {
		 * System.out.println(arr1[i]); }
		 */
		// Reverse an Array using stored in New Array

		/*
		 * int[] arr1 = { 10, 20, 46, 87, 54 }; int[] arr2 = new int[arr1.length]; int j
		 * = 0; for (int i = arr1.length - 1; i >= 0; i--) { arr2[j] = arr1[i]; j++;
		 * 
		 * } for (int l : arr2) { System.out.println(l); }
		 */

		// Find Largest Number and Smallest Number in Array

		/*
		 * int[] arr = { 10, 20, 46, 87, 54 }; int max=arr[0]; int min=arr[0]; for (int
		 * i = 1; i < arr.length; i++) {
		 * 
		 * if (max<arr[i]) { max=arr[i]; }
		 * 
		 * else if (min>arr[i]) { min=arr[i]; }
		 * 
		 * }
		 * 
		 * System.out.println("Maximum No: "+max);
		 * System.out.println("Minimum No: "+min);
		 */
		// Find 2nd Largest Element

		/*
		 * int[] arr = { 10, 87, 46, 98, 9, 245, 176 }; int max1 = Integer.MIN_VALUE;
		 * int max2 = Integer.MIN_VALUE; for (int i = 0; i < arr.length; i++) { if (max1
		 * < arr[i]) { max2 = max1; max1 = arr[i];
		 * 
		 * } else if (max2 < arr[i] && arr[i] != max1) { max2 = arr[i]; } }
		 * System.out.println(max1); System.out.println(max2);
		 */
		// Find 3rd Largest 
		/*
		 * int[] arr = { 10,20,65,47 }; int max1 = Integer.MIN_VALUE; int max2 =
		 * Integer.MIN_VALUE; int max3 = Integer.MIN_VALUE; for (int i = 0; i <
		 * arr.length; i++) { if (max1 < arr[i]) { max3=max2; max2 = max1; max1 =
		 * arr[i];
		 * 
		 * } else if (max2 < arr[i] && arr[i] != max1) { max3=max2; max2 = arr[i]; }
		 * else { max3=arr[i]; } } System.out.println("Largest 1:"+max1);
		 * System.out.println("Largest 2:"+max2); System.out.println("Largest 3:"+max3);
		 */
		
		// Store  Even Numbers in another Array 
		
		/*
		 * int[] arr= {-14,28,76,-12,431}; int[] arr1=new int[arr.length]; int j=0; for
		 * (int i = 0; i < arr.length; i++) { if (arr[i]%2==0) { arr1[j]=arr[i]; j++; }
		 * }
		 * 
		 * for (int k = 0; k < j; k++) { System.out.println(arr1[k]); }
		 */
		// Remove Duplicates from Array 
		int[] arr= {};
		System.out.println(arr[0]);
		/*
		 * for (int i = 0; i < arr.length; i++) { int count=1;
		 * 
		 * if (arr[i]==Integer.MIN_VALUE) continue; for (int j = i+1; j < arr.length;
		 * j++) { if (arr[i]==arr[j]) { count++; arr[j]=Integer.MIN_VALUE; } } } for
		 * (int j = 0; j < arr.length; j++) { if (arr[j]!=01) {
		 * System.out.println(arr[j]); } }
		 * 
		 */
	}
 
}
