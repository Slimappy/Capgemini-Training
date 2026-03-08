package Assignments;

import java.util.Scanner;
public class DiagonalSum {

	public static void main(String[] args) {
		
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of rows : ");
		int row=sc.nextInt();
		System.out.println("Enter no of columns : ");
		int col=sc.nextInt();
		
		int matrix[][]=new int[row][col];
		
		System.out.println("Enter elements in the array : ");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		
		if(row==col) {
			for(int i=0;i<matrix.length;i++) {
				sum+=matrix[i][i];
			}
		System.out.println("Sum of primary diagonal = "+sum);
		}
		else {
			System.out.println("NOT a Square Matrix");
		}
		
		sc.close();
	}
}
