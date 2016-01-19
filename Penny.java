package spoj;

import java.util.Scanner;

public class Penny {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());
		String options[]={"TTT","TTH","THT","THH","HTT","HTH","HHT","HHH"};
		for(int a=1;a<=n;a++)
		{
			int c=Integer.parseInt(s.nextLine());
			String input=s.nextLine();
			int []count=new int[8]; 
			for(int b=0;b<input.length()-2;b++)
			{
				String outcome=input.charAt(b)+""+input.charAt(b+1)+""+input.charAt(b+2);
				for(int d=0;d<8;d++)
				{
					if(outcome.equals(options[d])){
						count[d]++;
					}
				}
			}
			System.out.print(c+" ");
			for(int e=0;e<8;e++){
				if(e!=7)
				System.out.print(count[e]+" ");
				else
					System.out.println(count[e]);
				}
			System.out.println();
		}

	}

}
