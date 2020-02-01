package lab;

import java.util.Scanner;
import java.util.Arrays; 
public class ex3_1 {
	int getSecondSmallest(int a[],int n) {
		Arrays.sort(a);
		
		return a[n-2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ex3_1 ob=new ex3_1();
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] a ;
		a= new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(ob.getSecondSmallest(a,n));
	}

}
