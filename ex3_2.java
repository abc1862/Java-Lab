package lab;

import java.util.Scanner;
import java.util.Arrays; 
public class ex3_2 {
	public String[] proc(String[] s,int n) {
		Arrays.sort(s);
		for(int i=0;i<n;i++) {
			s[i]= s[i].toLowerCase();
		}
		for(int i=0;i<((n/2)+1);i++) {
			s[i]= s[i].toUpperCase();
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex3_2 obj = new ex3_2();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String[] s= new String[3];
		for(int i=0;i<a;i++) {
			s[i] = sc.next();
		}
		obj.proc(s,a);
		for(int i=0;i<a;i++) {
			System.out.println(s[i]);
		}
	}

}
