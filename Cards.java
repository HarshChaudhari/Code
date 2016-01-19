package spoj;

import java.math.BigInteger;
import java.util.Scanner;

public class Cards {

	public static void main(String[] args) {
	BigInteger three=new BigInteger("3");
	BigInteger two=new BigInteger("2");
	BigInteger val=new BigInteger("1000007");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	s.nextLine();
	for(int a=0;a<n;a++)
	{
		BigInteger k=s.nextBigInteger();
		BigInteger t=three.multiply(k.pow(2)).add(k).divide(two);
		System.out.println(t.mod(val));
	}
	}

}
