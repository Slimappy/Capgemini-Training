package array;

public class MinMaxDiff {

	public static void main(String[] args) {
		 
		int arr[]= {2,5,6,10,15,20};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Max :"+max);
		System.out.println("Min :"+min);
		System.out.println("Difference = "+(max-min));
	}
}
