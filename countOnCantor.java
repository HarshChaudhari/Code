package spoj;

import java.util.Scanner;

public class countOnCantor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		while(a-->0){
			s.nextLine();
			long b=s.nextLong(),k,c;
			for(c=0;b>(c*(c+1))/2;c++);
			k=(c*(c+1))/2;
			System.out.println(c);
			if(c%2==0){
				System.out.println("TERM "+b+" IS "+(c-(k-b))+"/"+((c+1)-(c-(k-b))));
			}
			else{
				System.out.println("TERM "+b+" IS "+((c+1)-(c-(k-b)))+"/"+(c-(k-b)));
			}
		}

	}

}
