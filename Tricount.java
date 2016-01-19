package spoj;
import java.math.BigInteger;
import java.util.*;

public class Tricount {
	static Map<BigInteger, BigInteger> map=new HashMap<BigInteger, BigInteger>();
	static BigInteger two=new BigInteger("2");
	public static void main(String[] args) {
		int n;
		BigInteger two=new BigInteger("2");
		Scanner s=new Scanner(System.in);
		n=Integer.parseInt(s.nextLine());
		for(int a=0;a<n;a++)
		{
			BigInteger k=s.nextBigInteger();
			BigInteger up=upCount(k);
			BigInteger down=downCount(k);
			System.out.println(up.add(down));
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
