import java.util.regex.Pattern;
import java.util.Scanner;


public class twoDimenArray {
	
	public void twoDimenArrays()
	{
		
	}
	
	public static void main(String args[])
	{
		char[][] args1=new char[100][100];
		String letters="WELCOMETOZOHOCORPORATION";
		String findString = "TOO";
		
		
		int n =0,p=0,q=0;
		int m=0;
		for( m=0;m<letters.length();m+=5)
		{
		int k=0;
			for(n=m;n<5+m && n<letters.length();n++)
			{
				System.out.print(letters.charAt(n));
				args1[m][k]=letters.charAt(n);
				k++;
				
			}
			p++;
			System.out.println();
		}
		System.out.println(m + " " +  n + " " + p );
		int[] startIndex = new int[2];
		
		for(int i=0;i<letters.length();i+=5)
		{
			
			int k=0;
			int j=0;
			
			for( j=0;j<5 && k<=2;j++)
			{
				System.out.println(findString.charAt(k) + " " + args1[i][j]);
				if(findString.charAt(k)==args1[i][j])
				{
					System.out.println("comparing left" + findString.charAt(k) + args1[i][j]);
					
					k++;
				}
				
			}
			if(k==2)
			{
				startIndex[0]=i;
				startIndex[1]=j;
				break;
			}
		
	}
		
		for(int j=0; j<5 ;j++)
		{
			int k=0;
			int i=0;
			System.out.println(  j);
			for(i=0; i<letters.length() && k<=2;i+=5)
			{
				System.out.println(i + " " + j);
				System.out.println(findString.charAt(k) + " " + args1[i][j]);
				if(findString.charAt(k)==args1[i][j])
				{
					System.out.println(findString.charAt(k) + " " + args1[i][j]);
					System.out.println("comparing top" + findString.charAt(k) + args1[i][j]);
					k++;
					System.out.println("Value of k is" + k);
				}
				
			}
			if(k==3)
			{
				System.out.println("Value of k is" + k);
				startIndex[0]=i-3;
				startIndex[1]=j;
				break;
			}
		
	}
		
		System.out.println(startIndex[0]);
	}

}
