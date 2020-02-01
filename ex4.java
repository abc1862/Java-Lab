package lab;

import java.util.Scanner;

public class ex4 {
	boolean find(int a) {
		for(int i=1;i<=a;i = i*2) {
			if(i == a) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex4 obj= new ex4();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(obj.find(a));
	}

}
