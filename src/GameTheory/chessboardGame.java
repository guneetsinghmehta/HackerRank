package GameTheory;
//https://www.hackerrank.com/challenges/a-chessboard-game-1
import java.util.*;
public class chessboardGame {
	static boolean visited[][]=new boolean[15][15];
	static boolean canWin[][]=new boolean[15][15];
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int testcases=scanner.nextInt();
		
		for(int i=0;i<15;i++)
		{
			for(int j=0;j<15;j++)
			{
				sub(i,j);
			}
		}
		while(testcases-->0)
		{
			int x=scanner.nextInt()-1;
			int y=scanner.nextInt()-1;
			if(canWin[x][y])
			{
				System.out.println("First");
			}
			else
			{
				System.out.println("Second");
			}
		}
		scanner.close();
	}
	
	public static boolean sub(int x,int y)
	{
		if(!isValid(x,y)){return false;}
		else
		{
			if(visited[x][y])
			{
				return canWin[x][y];
			}
			else
			{
				boolean ans=false;
				ans=ans||(isValid(x-2,y+1)&&!sub(x-2,y+1));
				ans=ans||(isValid(x-2,y-1)&&!sub(x-2,y-1));
				ans=ans||(isValid(x+1,y-2)&&!sub(x+1,y-2));
				ans=ans||(isValid(x-1,y-2)&&!sub(x-1,y-2));
				visited[x][y]=true;
				canWin[x][y]=ans;
				return ans;
			}
		}
	}
	
	public static boolean isValid(int x,int y)
	{
		boolean ans=true;
		if(x<0||x>=15||y<0||y>=15){ans=false;}
		return ans;
	}
}
