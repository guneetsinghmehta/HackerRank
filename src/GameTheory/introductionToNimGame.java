package GameTheory;
//https://www.hackerrank.com/challenges/nim-game-1
import java.util.*;
public class introductionToNimGame {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int testcases=scanner.nextInt();
		while(testcases-->0)
		{
			int n=scanner.nextInt();
			int sum=0;
			while(n-->0)
			{
				sum=sum^scanner.nextInt();
			}
			if(sum==0){System.out.println("Second");}
			else
			{
				System.out.println("First");
			}
		}
		scanner.close();
	}
}
