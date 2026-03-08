package Assignments;

import java.util.Arrays;
public class OnesAndZeros {

	public static void main(String args[]) {
		
		int count=0;		//counts no of zeros (you can also count no of 1's)
		int arr[]= {0,0,1,0,1,0,0};
	
		for(int i=0;i<arr.length;i++) {
		if(arr[i]==0) {
			count++;
			}
		}
		
		//Transforms the initial cells to 1's
		for(int i=0;i<arr.length-count;i++) {
			arr[i]=1;
		}
		
		//Transforms the remaining cells to 0's
		for(int i=arr.length-count;i<arr.length;i++) {
			arr[i]=0;
		}
		
		System.out.println(Arrays.toString(arr));		//Used to print the array directly
		
//		Other approach to print the array
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
	}
}
