package spoj;
import java.util.*;
public class SizeCon {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,k=0;
		n=s.nextInt();
		s.nextLine();
		for(int a=0;a<n;a++)
		{	
			int m=s.nextInt();
			s.nextLine();
			if(m<0)
				continue;
			else
				k+=m;
		}
		System.out.print(k);
	}
}
