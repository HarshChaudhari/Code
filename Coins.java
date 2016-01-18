package spoj;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Coins {
	static BigInteger x;
	static Map<BigInteger, BigInteger> map=new HashMap<BigInteger, BigInteger>();
	static BigInteger four=new BigInteger("4");
	static BigInteger three=new BigInteger("3");
	static int l=0;
	public static void main(String[] args) {
		boolean  n;
		Scanner s=new Scanner(System.in);		
		while((n=s.hasNextBigInteger())==true && l<10)
		{	
			BigInteger k=coins(s.nextBigInteger());
			System.out.println(k);
			l++;
		}
	}
	public static BigInteger coins(BigInteger n) {
		if(map.containsKey(n))
			return map.get(n);
		if(n.equals(BigInteger.ZERO))
			return BigInteger.ZERO;
		else if(n.equals(BigInteger.ONE))
			return BigInteger.ONE;
		else if(n.equals(BigInteger.ONE.add(BigInteger.ONE)))
			return BigInteger.ONE.add(BigInteger.ONE);
		else
		{
			x=coins(n.divide(four)).add(coins(n.divide(three))).add(coins(n.divide(BigInteger.ONE.add(BigInteger.ONE))));
			if(x.compareTo(n)==1)
			{
				map.put(n,x);	
				return x;
			}
			else
			{
				map.put(n,n);
				return n;
			}
		}
	}

}
