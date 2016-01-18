package spoj;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n,c;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		s.nextLine();
		int count=0;
		for(int a=0;a<n;a++)
		{	 
			count=0;
			c=Integer.parseInt(s.nextLine());
			for(int b=1;Math.pow(5,b)<=c;b++)
			{
				count=(int) (count+c/Math.pow(5,b));
			}	
			System.out.println(count);
		}
	}
}
