package spoj;

import java.util.Scanner;

public class Candy3 {
	public static void main(String[] args) {
		long n,x;
		Scanner s=new Scanner(System.in);
		x=s.nextLong();
		s.nextLine();
		s.nextLine();
		for(long b=0;b<x;b++)
		{	
			n=s.nextLong();
			s.nextLine();
			long total=0;
			for(long a=0;a<n;a++)
			{
				total=(total+s.nextLong()%n)%n;
				s.nextLine();
			}
			if(total!=0)
				System.out.println("NO");
			else 
				System.out.println("YES");
/*			if(b!=(x-1))
				s.nextLine();*/
		}
	}

}
