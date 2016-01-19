package spoj;

import java.math.BigInteger;
import java.util.*;

public class Triangles {
	static Map<BigInteger, BigInteger> map=new HashMap<BigInteger, BigInteger>();
	static BigInteger two=new BigInteger("2");
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		int a=0,n=s.nextInt();
		s.nextLine();
		while(a<n){
			a++;
			BigInteger k=s.nextBigInteger();
			s.nextLine();
			System.out.println((downCount(k)).add((upCount(k))));
		}
	}
	public static BigInteger downCount(BigInteger k) {
		if(map.containsKey(k))
			return map.get(k);
		if(k.compareTo(BigInteger.ZERO)==-1 || k.compareTo(BigInteger.ZERO)==0)
			return BigInteger.ZERO;
		else
		{
			BigInteger sum=k.multiply(k.subtract(BigInteger.ONE)).divide(two).add(downCount(k.subtract(two)));
			map.put(k, sum);
			return sum;
		}
	}
	public static BigInteger upCount(BigInteger k) {
		BigInteger sum=downCount(k).add(downCount(k.add(BigInteger.ONE)));
		return sum;
	}
}