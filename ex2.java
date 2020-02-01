package lab;

import java.util.Scanner;
import java.lang.Math;

public class ex2 {
	int find(int n) {
		int ans = 0;
		int sqs=0;
		int ssq = 0;
		for(int i=1;i<=n;i++) {
			sqs +=i;
			ssq = (int) (ssq + (Math.pow(i,2)));
		}
		ans = (int) (ssq - (Math.pow(sqs,2)));
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex2 obj = new ex2();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(obj.find(n));
	}

}
