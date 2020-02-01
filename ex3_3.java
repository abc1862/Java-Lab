package lab;

import java.util.Arrays;
import java.util.Scanner;

public class ex3_3 {
	int rev(int num) {
		int reversed = 0;
		while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
		return reversed;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex3_3 obj = new ex3_3();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			a[i]=obj.rev(a[i]);
		}
		
		Arrays.sort(a);
		for(int j=0;j<n;j++) {
			System.out.println(a[j]);
		}
	}

}
