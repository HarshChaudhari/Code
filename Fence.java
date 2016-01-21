package spoj;

import java.util.Scanner;

public class Fence {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(true){
		int l=s.nextInt();
		if(l==0)
			break;
		System.out.println(Math.round(((float)(l*l)/2/Math.PI)*100.0)/100.0);
	}
	}
}