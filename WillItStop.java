package spoj;

import java.math.BigInteger;
import java.util.Scanner;

public class WillItStop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		BigInteger a=BigInteger.valueOf(s.nextLong());
		BigInteger b=a.subtract(new BigInteger("1"));
		if(b.and(a).equals(new BigInteger("0")))
			System.out.println("TAK");
		else
			System.out.println("NIE");
	}
}
