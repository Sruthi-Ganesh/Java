import java.util.Scanner;
import java.util.ArrayList;
public class divisibility {

	public  static void divisible(ArrayList<String> array )
	{
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		for(int i=0;i<array.size();i++)
		{
			int number = Integer.parseInt(array.get(i));
		
			Double sqrt = Math.sqrt(number);
			int num = sqrt.intValue();
			if(Math.sqrt(sqrt)==Math.sqrt(num))
			{
				numbers.add(5);
			}
			else if(number%24==0)
			{
				numbers.add(4);
			}
			else if(number%2==0)
			{
				numbers.add(3);
			}
			else
			{
				numbers.add(0);
			}
			System.out.print("<"+number+ "," + numbers.get(i) + ">,");
				
		}
		
		
	}
	
	public static void main(String args[])
	{
		ArrayList<String> array = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		String number = in.next();
		System.out.println(number);
		String numb="";
		int j=0;
		
		
		for(int i =0; number.charAt(i)!='>';i++)
		{
			System.out.println(i);
			
			
			if(number.charAt(i)!='<')
			{
				System.out.println("Entering if:");
				if(number.charAt(i)!=',')
				{
					System.out.println("while: ");
					numb+=String.valueOf(number.charAt(i));
					System.out.println(numb);
					j+=1;
					
					
				}
				else
				{
					numb = "";
					j=0;
					
				}
				
				
			}	
			if(number.charAt(i+1)==',' || number.charAt(i+1)=='>')
			
				{
				array.add(String.valueOf(numb));
				}
				
			 
			    
		}
				
		
		System.out.println(array);
			divisible(array);
	
	}
}
