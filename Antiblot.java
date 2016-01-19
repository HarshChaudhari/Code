package spoj;

import java.io.*;

public class Antiblot {

	public static void main(String[] args) throws IOException {
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out,true);
		int n=Integer.parseInt(s.readLine());
		s.readLine();
		for(int a=0;a<n;a++)
		{	
			String input[]=s.readLine().split("\\+ ");
			String x=input[0];
			x=x.trim();
			String[] temp=input[1].split(" = ");
			String y=temp[0];
			String z=temp[1];
			int m=0,g=0,size=0;
			String value=null;
			if(x.contains("machula")){
				x=x.replace("machula", "k");
				m=Integer.parseInt(z)-Integer.parseInt(y);
				g=x.indexOf('k');
				size=x.length();
			}
			else if(y.contains("machula")){
				y=y.replace("machula", "k");
				g=y.indexOf('k');
				m=Integer.parseInt(z)-Integer.parseInt(x);
				size=y.length();
			}
			else if(z.contains("machula"))
			{
				z=z.replace("machula","k");
				m=Integer.parseInt(x)+Integer.parseInt(y);
				g=z.indexOf('k');
				size=z.length();
			}
			String l=Integer.toString(m);
			if(size<=l.length())
				value=l.substring(g,g+l.length()-size+1);
			else if(g==(l.length()-1))
				value=l.substring(g);
			/*else if(g<(l.length()-1))
				value=l.substring(g,g+l.length()-size+1);*/
			x=x.replace("k",value);
			y=y.replace("k",value);
			z=z.replace("k",value);
			pw.println(x+" + "+y+" = "+z);
			if(a!=(n-1))
			s.readLine();
		}

	}

}
