package spoj;

import java.util.Scanner;

public class Candy {

	public static void main(String[] args) {
		int n,x,y=0;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		s.nextLine();
		s.nextLine();
		while(y<x)
		{
			n=s.nextInt();
			/*if(n==-1)
				break;*/
			/*else if(n<1 || n>10000)
				continue;*/
			s.nextLine();
			int b[]=new int[n];
			int total=0;
			for(int a=0;a<n;a++)
			{
				b[a]=s.nextInt();
				while(s.hasNext())
				s.nextLine();
				total=total+b[a];
			}
			int avg=total/n;
			/*for(int a=0;a<n;a++)
			{	
				int f=avg-b[a];
				if(f>0)
					count=count+f;
			}*/
			if(avg==(int)(total-1)/n)
				System.out.println("NO");
			else 
				System.out.println("YES");
			y++;
			if(y!=x)
			s.nextLine();
		}
	}
}