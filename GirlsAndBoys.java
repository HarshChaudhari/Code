package spoj;

import java.util.Scanner;

public class GirlsAndBoys {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(true){
			int m=s.nextInt(),n=s.nextInt();
			if(m==(-1) && n==(-1))
				break;
			else
			{	int k=(int) Math.ceil((double)Math.max(m, n)/(Math.min(m, n)+1));
				System.out.println(k);
			}
		}

	}

}
