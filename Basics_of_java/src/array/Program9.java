package array;

public class Program9 {

	//Adding 2 2D arrays
	public static void main(String[] args) {
		
		int [][]a= {{7,9},{4,2}};
		int [][]b= {{1,2},{3,1}};
		
		int [][] res=sum(a,b);
		print(res);
		
	}
	
	public static int [][] sum(int [][]a,int[][]b){
		
		int row=a.length;
		int col=a[0].length;
		int [][] res=new int[row][col];
		
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[0].length;j++) {
				res[i][j]=a[i][j]+b[i][j];
			}
		}
		return res;
	}
	
	public static void print(int [][] res) {
		
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[0].length;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
