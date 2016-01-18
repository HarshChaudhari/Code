package spoj;

import java.math.BigInteger;
import java.util.Scanner;

public class SmallFactorial {

	public static void main(String[] args) {
		int n,c;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		s.nextLine();
		for(int a=0;a<n;a++)
		{	
			BigInteger count=new BigInteger("0");
			BigInteger fact=new BigInteger("1");
			BigInteger fact1=new BigInteger("1");
			c=Integer.parseInt(s.nextLine());
			for(int b=c;b>0;b--)
			{
				fact=fact.multiply(fact1);
				fact1=fact1.add(BigInteger.ONE);
				/*if(fact.remainder(BigInteger.TEN)==BigInteger.ZERO)
				{
					count=count.add(BigInteger.ONE);
					fact=fact.divide(BigInteger.TEN);
				}*/
			}
			/*while(fact.remainder(BigInteger.TEN)==BigInteger.ZERO)
			{
				count=count.add(BigInteger.ONE);
				fact=fact.divide(BigInteger.TEN);
			}*/
			System.out.println(fact);
		}
	}
}
