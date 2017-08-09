import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
public class max {
	
	public static void maxOfAllElements(ArrayList<Integer> numbers)
	{
	
		for(int i =0;i<numbers.size()-1;i++)
		{
			int flag=0;
			for(int j=i+1;j<numbers.size();j++)
			{
				if(numbers.get(i)>=numbers.get(j))
				{
					flag=1;
				}
			}
			
			if(flag==0)
			{
				System.out.println(numbers.get(i));
			}
		}
		
	}
	
	public static void main(String args[]){
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		
		Scanner scanner = new Scanner(System.in);
		Pattern delimiters = Pattern.compile(System.getProperty("line.separator")+"|\\s");
		scanner.useDelimiter(delimiters); 
		while (scanner.hasNextInt()) {
		  int number = scanner.nextInt();
		  numbers.add(number);
		  
		 
		}
		System.out.println(numbers);
		maxOfAllElements(numbers);
		scanner.close();
	}
}
