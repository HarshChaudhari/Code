package spoj;

import java.util.Scanner;
import java.util.Stack;

public class StreetParade {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(s.hasNextLine()){
			int n=Integer.parseInt(s.nextLine());
			if(n==0)
				break;
			else
			{
				int in[]=new int[n];
				int k=1;
				Stack<Integer> st=new Stack<Integer>();
				for(int a=0;a<n;a++)
					in[a]=s.nextInt();
				s.nextLine();
				for(int a=0;a<2*n;a++){
					if(a<n && in[a]==k){
						k++;
						continue;
					}
					else
					{
						if(!st.isEmpty())
						{	
							if(st.lastElement()==k){
								k++;
								a--;
								st.pop();
							}
							else if(a>n){
								break;
							}
							else if(a<n)
								st.push(in[a]);
						}
						else if(a<n)
							st.push(in[a]);
					}
				}
				if(st.isEmpty())
					System.out.println("yes");
				else
					System.out.println("no");
			}
		}
	
	}
}