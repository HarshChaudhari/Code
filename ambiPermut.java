package spoj;

import java.util.Scanner;

public class ambiPermut {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(true){
			int a=s.nextInt(),count=0;
			if(a!=0){
				s.nextLine();
				String no[]=s.nextLine().split(" ");
				int pos[]=new int[no.length+1];
				for(int b=0;b<no.length;b++){
					pos[Integer.parseInt(no[b])]=b+1;
				}
				for(int c=1;c<(no.length+1);c++){
					if(pos[pos[c]]==c)
						count++;
					else
						break;
				}
				if(count==no.length)
					System.out.println("ambiguous");
				else
					System.out.println("not ambiguous");
			}
			else
				break;
		}
	}

}
