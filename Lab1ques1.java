import java.util.Scanner;


public class Lab1ques1 {
	int calculateSum(int n){
		int s=0;
		for(int i=1;i<=n;i++){
			if(i%3==0 || i%5==0){
				s=s+i;
			}
		}
		return s;
	}
	public static void main(String args[]){
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=s.nextInt();
		Lab1ques1 l=new Lab1ques1();
		int sum=l.calculateSum(n);
		System.out.println("The sum of first n natural number is:"+sum);
		s.close();
	}
}
