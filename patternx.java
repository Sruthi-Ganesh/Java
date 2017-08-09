import java.util.ArrayList;
import java.util.Scanner;
public class patternx {
	
	public static void readPattern(int N,String letters)
	{
		int i=0;
		for( i=0;i<N/2;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(" ");
			}
			
			System.out.print(letters.charAt(i));
			
			for(int k=1;k<=(N-2*(i+1));k++)
			{
				System.out.print("*");
			}
			
			System.out.println(letters.charAt(N-i-1));
		}
		
		for( i=N/2;i<N;i++)
		{
			
			
			for(int j=1;j<=N-i-1;j++)
			{
				System.out.print(" ");
			}
			
			System.out.print(letters.charAt(N-i-1));
			
			for(int k=(2*i-N);k>=1;k--)
			{
				System.out.print("*");
			}
			if(i!=N/2)
			{
			System.out.println(letters.charAt(i));
			}
			else
			{
				System.out.println("");
			}
		}
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		ArrayList<String> letters = new ArrayList<String>(); 
		String letter = in.nextLine();
		System.out.println(letter.trim());
		
		int length = letter.length();
		System.out.println(length);
		readPattern(length,letter);
		
		in.close();
		
	}
}
