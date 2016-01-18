package spoj;

import java.util.*;

public class TransformTheExpression {
	static int k=0;
	static Stack<Character> st=new Stack<Character>();
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		for(int a=0;a<n;a++)
		{
			String input =s.nextLine();
			store(input);
			System.out.println();
		}
	}
	public static void store(String input) {
		char exp[]=new char[500];
		for(int a=0;a<input.length();a++)
		{
			exp[a]=input.charAt(a);
		}
		check(exp);
	}
	public static void check(char[] exp) { 
		for(int a=0;a<exp.length;a++)
		{
			if(exp[a]=='(')
			{	
				st.push(exp[a]);
			}
			else if(exp[a]==')')
			{	
				while(st.lastElement()!='(')
					System.out.print(st.pop());
				st.pop();
				
			}
			else if(exp[a]=='+' || exp[a]=='-' || exp[a]=='*' || exp[a]=='^' || exp[a]=='/')
			{
				st.push(exp[a]);
			}
			else
				System.out.print(exp[a]);
		}
	}
}