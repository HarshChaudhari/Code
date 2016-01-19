package spoj;

import java.math.BigInteger;
import java.util.Scanner;

public class Eights {

	public static void main(String[] args) {
		BigInteger k,m;
		BigInteger a=new BigInteger("250");
		BigInteger b=new BigInteger("58");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		for(int c=0;c<n;c++){
		k=s.nextBigInteger();
		s.nextLine();
		m=k.multiply(a).subtract(b);
		System.out.println(m);
	}
}
}
