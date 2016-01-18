package spoj;

import java.util.Scanner;

public class NSteps {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		for(int d=0;d<n;d++)
		{
			int x = s.nextInt();
			int y = s.nextInt();
			s.nextLine();
			if(x!=y && x-y!=2)
				System.out.println("No Number");
			else if(x%2==0 && y%2==0)
				System.out.println(x+y);
			else if(x%2!=0 && y%2!=0)
				System.out.println(x+y-1);
		}
	}
}