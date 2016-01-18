package spoj;
import java.util.Scanner;
public class Feynman {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		while(s.hasNext())
		{	n=s.nextInt();
		if(n==0)
			break;
		else
		{
			s.nextLine();
			System.out.println((int)(n)*(n+1)*((2*n)+1)/6);
		}
		}
	}
}