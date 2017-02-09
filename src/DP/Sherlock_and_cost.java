package DP;
import java.util.*;
//https://www.hackerrank.com/challenges/sherlock-and-cost
public class Sherlock_and_cost {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int testcases=scanner.nextInt();
		while(testcases-->0)
		{
			int n=scanner.nextInt();
			int B[]=new int[n];
			int x[][]=new int[n][2];
			for(int i=0;i<n;i++)
			{
				B[i]=scanner.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				if(i==0)
				{
					x[0][0]=0;
					x[0][1]=0;
				}
				else
				{
					int ans=Integer.MIN_VALUE;
					ans=Math.max(ans, x[i-1][0]+Math.abs(1-1));
					ans=Math.max(ans, x[i-1][1]+Math.abs(B[i-1]-1));
					x[i][0]=ans;
					
					ans=Integer.MIN_VALUE;
					ans=Math.max(ans, x[i-1][0]+Math.abs(1-B[i]));
					ans=Math.max(ans, x[i-1][1]+Math.abs(B[i-1]-B[i]));
					x[i][1]=ans;
				}
			}
			int ans=Math.max(x[n-1][0],x[n-1][1]);
			System.out.println(ans);
		}
		scanner.close();
	}
	/*
	 * public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int testcases=scanner.nextInt();
		while(testcases-->0)
		{
			int n=scanner.nextInt();
			int B[]=new int[n];
			ArrayList<ArrayList<Integer>> ansList=new ArrayList<ArrayList<Integer>>();
			for(int i=0;i<n;i++)
			{
				B[i]=scanner.nextInt();
				ansList.add(new ArrayList<Integer>());
			}
			for(int i=0;i<n;i++)
			{
				if(i==0)
				{
					for(int j=0;j<=B[i];j++)
					{
						ansList.get(i).add(0);
					}
				}
				else
				{
					ansList.get(i).add(0);
					for(int j=1;j<=B[i];j++)
					{
						int ans=Integer.MIN_VALUE;
						for(int k=1;k<=B[i-1];k++)
						{
							int x=ansList.get(i-1).get(k)+Math.abs(j-k);
							ans=Math.max(ans,x);
						}
						ansList.get(i).add(ans);
					}
				}
			}
			int ans=Integer.MIN_VALUE;
			for(int i=0;i<ansList.get(n-1).size();i++)
			{
				ans=Math.max(ans, ansList.get(n-1).get(i));
			}
			System.out.println(ans);
		}
		scanner.close();
	}
	 * 
	 */
}
