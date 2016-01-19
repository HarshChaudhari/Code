package spoj;

import java.util.Scanner;

public class ToAndFro {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//int l=-1;
		//System.out.println(0%2);
		while(s.hasNextLine())
		{
			char str[]=new char[300];
			int b=0;
			int l=-1;
			int n=s.nextInt();
			if(n==0)
				break;
			s.nextLine();
			String input=s.nextLine();
			for(int i=0;i<n;i++)
			{
				l++;
				int j=i;
				while(j<input.length())
				{	
					if(l%2!=0)
					{
						str[b]=input.charAt(j);
						b++;
						j=(j%2!=0)?(j+1+2*(n-(i+1))):(j+(2*i+1));
					}
					else
					{
						str[b]=input.charAt(j);
						b++;
						j=(j%2==0)?(j+1+2*(n-(i+1))):(j+(2*i+1));
					}
				}
			}
			for(int a=0;a<b;a++)
			{
				System.out.print(str[a]);
			}
			System.out.println();
		}

	}

}
