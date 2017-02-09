package DP;
//https://www.hackerrank.com/challenges/equal
import java.util.*;
public class equal {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int testcases=scanner.nextInt();
		while(testcases-->0)
		{
			int n=scanner.nextInt();
			int nums[]=new int[n];
			int min=Integer.MAX_VALUE;
			for(int i=0;i<n;i++)
			{
				nums[i]=scanner.nextInt();
				min=Math.min(min, nums[i]);
			}
			int ans=Integer.MAX_VALUE;
			for(int i=0;i<5;i++)
			{
				ans=Math.min(ans, sub(nums,min-i));
			}
			System.out.println(ans);
		}
		scanner.close();
	}
	
	public static int sub(int nums[],int x)
	{
		int ans=0;
		for(int num:nums)
		{
			ans=ans+sub2(num,x);
		}
		return ans;
	}
	
	public static int sub2(int x,int target)
	{
		int ans=0;
		int diff=x-target;
		ans+=diff/5;
		diff=diff%5;
		ans+=diff/2;
		diff=diff%2;
		ans+=diff;
		
		return ans;
	}
	
}
