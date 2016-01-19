package spoj;

import java.util.Scanner;

public class Hangover {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		while(s.hasNextLine()){
			float n=s.nextFloat();
			if(n==0.00f)
				break;
			else
			{	
				int k=2,count=0;
				float sum=0.00f;
				//float f=s.nextFloat();
			//	s.nextLine();
				while(sum<n)
				{
					sum=sum+(float)1/k;
					k++;
					count++;
				}
				System.out.println(count+" card(s)");
			}
		}

	}

}
