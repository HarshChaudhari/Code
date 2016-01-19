package spoj;

import java.util.Arrays;
import java.util.Scanner;

public class Fashion {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n = Integer.parseInt(s.nextLine());
		for(int a=0;a<n;a++){
			int[] m,w;
			int k=Integer.parseInt(s.nextLine());
			m = new int[k];
			w = new int[k];
			String men[]=s.nextLine().split(" ");
			String women[]=s.nextLine().split(" ");
			for(int i=0;i<k;i++) {
			      m[i] = Integer.parseInt(men[i]);
			      w[i] = Integer.parseInt(women[i]);
			    }
			Arrays.sort(m);
			Arrays.sort(w);
			int hotness=0;
			for(int z=0;z<k;z++)
			{
				hotness=hotness +m[z]*w[z];
			}
			System.out.println(hotness);
		}
	}
}