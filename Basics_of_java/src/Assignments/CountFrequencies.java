package Assignments;

import java.util.Arrays;
public class CountFrequencies {

	public static void counting(int arr[],int n) {
		
		//create a boolean visited array to mark the elements already visited
		boolean visited[]=new boolean[n];
		
		//Traverse from the start
		for(int i=0;i<n;i++) {
			
			//Skip the element if already visited
			if(visited[i]==true)
				continue;		//This skips the rest of the code --> if element is found previously
			int count=1;		//Make the count 1 --> if the element is being visited first
			
			//Another loop iterates from the next position till the end --> Checks for repeated elements
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					visited[j]=true;	//Marks the arr[j] as processed
					count++;
				}
			}
			System.out.println(arr[i]+ " : " +count+" times");
		}
		System.out.println(Arrays.toString(visited));
	}
	public static void main(String[] args) {
		
		int arr[]= {5,5,10,20,15,10,5};
		int n=arr.length;
		
		counting(arr, n);
	}
}
