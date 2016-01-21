package spoj;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;;

public class Army {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		while(n-->0){
			s.nextLine();
			int noOfG=s.nextInt(),noOfM=s.nextInt(),maxM = 0,maxG = 0;
			s.nextLine();
	//		ArrayList<Integer> G=new ArrayList<Integer>();
	//		ArrayList<Integer> M=new ArrayList<Integer>();
			for(int a=0;a<noOfG;a++){
				int k=s.nextInt();
				if(maxG<k)
					maxG=k;
			}
			s.nextLine();
			for(int a=0;a<noOfM;a++){
				int m=s.nextInt();
				if(maxM<m)
					maxM=m;
			}
			if(n!=0)
			s.nextLine();
		//	Collections.sort(G);
		//	Collections.sort(M);
		/*	for(int a=0;;){
				if(M.isEmpty()){
					System.out.println("Godzilla");
					break;}
				else if(G.isEmpty()){
					System.out.println("MechaGodzilla");
					break;}
				int k=Math.min(M.get(a), G.get(a));
				if(k==M.get(a))
					M.remove(a);
				else
					G.remove(a);
			}*/
			//Math.max(G.get((noOfG-1)), M.get((noOfM-1)));
			//if(G.get((noOfG-1))>=M.get((noOfM-1)))
			if(maxG>=maxM)	
				System.out.println("Godzilla");
			else
				System.out.println("MechaGodzilla");
		}
	}
}