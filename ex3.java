package lab;

import java.util.Scanner;

public class ex3 {
	boolean find(int a) {
		int t1 =10,t2;
		while(a!=0) {
			t2 = a%10;
			if(t1>t2) {
				return false;
			}
			a= a/10;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex3 obj= new ex3();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(!obj.find(a)) {
			System.out.println("Increasing");
		}else {
			System.out.println("Not Increasing");
		}
	}

}
