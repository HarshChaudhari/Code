package spoj;

import java.util.Arrays;
import java.util.Scanner;

public class Stamps {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		s.nextLine();
		for(int e=1;e<=a;e++){
			String in[]=s.nextLine().split(" ");
			int n=Integer.parseInt(in[0]);
			int f=Integer.parseInt(in[1]);
			int st[]=new int[f];
			String inp[]=s.nextLine().split(" ");
			for(int b=0;b<inp.length;b++){
				st[b]=Integer.parseInt(inp[b]);
			}
			Arrays.sort(st);
			long total=0,count=0;
			for(int c=(f-1);c>=0;c--){
				total=total+st[c];
				count++;
				if(total>=n)
					break;
				else if(total<n && c==0){
					count=-1;
				}
			}
			System.out.println("Scenario #"+e+":");
			if(count!=-1)
				System.out.println(count);
			else
				System.out.println("impossible");
			System.out.println();
		}
	}

}
