package spoj;
import java.util.Scanner;
public class countTri {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		int a=s.nextInt();
		long b;
		while(a-->0){
			s.nextLine();
			b=s.nextLong();
			System.out.println((b*(b+1)*(b+2))/6+d(b));
		}
	}
	public static long d(long b) {
		if(b==1)
			return 0;
		else if(b==2)
			return 1;
		else
			return ((b*(b-1))/2+d(b-2));
	}
}