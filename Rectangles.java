package spoj;

import java.util.Scanner;

public class Rectangles {

	public static void main(String[] args) {
		int n,c=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int a=1;(n/a)>=(a-1);a++)
		{
			c=c+((n/a)-(a-1));
		}
		System.out.println(c);

	}

}
