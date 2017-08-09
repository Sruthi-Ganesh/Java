import java.util.ArrayList;
import java.util.Scanner;
public class brackets {
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		StringBuilder letters = new StringBuilder("");
		
		letters.append(in.nextLine());
		System.out.println(letters);
		int i=0,j=0;
		while(i<letters.length())
		{
			if(letters.charAt(i)=='(')
			{
				j++;
			}
			if(letters.charAt(i)==')')
			{
				j--;
			}
			i++;
		}
		 i=0;
		 
			while(j>=1 && i<letters.length())
			{
				if(letters.charAt(i)=='(')
				{
				    letters.setCharAt(i, ' ');
					j--;
				}
				
				i++;
			}
		
			i=letters.length()-1;
			 
			while(j<0 && i>=0)
			{
				if(letters.charAt(i)==')')
				{
				    letters.setCharAt(i, ' ');
					j++;
				}
				
				i--;
			}
		System.out.println(letters.toString().trim());
		in.close();
	}

}
