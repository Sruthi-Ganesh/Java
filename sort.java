import java.util.Scanner;
import java.util.ArrayList;
public class sort {
	
	sort()
	{
		
	}
	
	public static void main(String args[]){
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<Integer> sortNumbers = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int minloc=0;
		int maxloc=0;
		int max = Integer.MIN_VALUE;
		int x;
		while(true)
		{
			x=in.nextInt();
			if(( x ==100))
			{
				break;
			}
			int number = x;
			numbers.add(number);
		
		}
		
		System.out.println(numbers.toString() + numbers.size());
		
		while(!(numbers.isEmpty()))
		{
			System.out.println(numbers.isEmpty());
			min=Integer.MAX_VALUE;
			max=Integer.MIN_VALUE;
			int n=numbers.size();
		for(int i=0;i<numbers.size();i++)
		{
			
			
			if(numbers.get(i)<min)
			{
				min=numbers.get(i);
				minloc=i;
				
			}
			if(numbers.get(i)>max)
			{
				max=numbers.get(i);
				maxloc=i;
				
			}
			
			System.out.println("loop : " +i);
		}
		System.out.println(numbers);
		System.out.println(numbers.size());
		
		
		if(  minloc<numbers.size()-1)
		{
			System.out.println("Removing Element at " + maxloc + " is " + max);
			sortNumbers.add(max);
			numbers.remove(maxloc);
			
			if(minloc!=maxloc && minloc<=n && minloc>=0 )
			{	
			System.out.println("Removing Element at " + minloc + " is" + min);
			sortNumbers.add(min);
			numbers.remove(minloc);
			}
			
			
		}
		else if(maxloc<numbers.size()-1)
		{
			System.out.println("Removing Element at " + maxloc + " is " + max);
			sortNumbers.add(max);
			
			
			if(minloc!=maxloc && minloc<=n && minloc>=0  )
			{	
				System.out.println("Removing Element at " + minloc + " is" + min);
			sortNumbers.add(min);
			numbers.remove(minloc);
			}
			numbers.remove(maxloc);
		}
		 if(numbers.size()==1)
		{
			sortNumbers.add(numbers.get(0));
			numbers.remove(numbers.get(0));
		}
		   
		
        min=Integer.MAX_VALUE;
        max=Integer.MIN_VALUE;
		
		
		
		
		}
		
		System.out.println(sortNumbers.toString());
	}

}
