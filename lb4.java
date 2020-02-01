package lab;

import java.util.Scanner;
import java.lang.Math;

public class lb4 {
	int sumc(int a,int n) {
		int cb = 0;
		for(int i=0;i<n;i++) {
			cb = (int) (cb + Math.pow((a%10), 3));
			a=a/10;
		}
		return cb;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lb4 obj = new lb4();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		System.out.println(obj.sumc(a, n));
	}

}
