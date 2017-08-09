import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
public class mostOccurrences {

	public static void occurrences(ArrayList<Integer> a)
	{
		int max = Integer.MIN_VALUE;
		int maxValue =0;
		int[] array = new int[20];
		int [] sort = new int[2];
		for(int i=0;i<a.size();i++)
		{
			int pos = a.get(i);
			array[pos]++;
			System.out.println("Position: " + pos);
			System.out.println("array: " + array[pos] + "max: " + max);
			if(array[pos]>max)
			{
				max = array[pos];
				maxValue = pos;
				System.out.println(maxValue);
				
			}
		}
		
		
	int m = 0;
		for(int k=0;k<array.length;k++)
		{
			
			if(array[k]==max)
			{
				System.out.println(m);
				
				sort[m]=k;
				m++;
				sort = new int[m];
			}
		}
		sort(sort);
	}
	
	public static void sort(int [] sortArray)
	{
		System.out.println(sortArray.length);
		for(int i=0;i<sortArray.length-1;i++)
		{
			for(int j=i+1;j<sortArray.length;j++)
			{
		 if(sortArray[j]>sortArray[i])
		 {
			 System.out.println(sortArray[i] + " " + sortArray[j] + " " + i + " " + j);
			 int temp = sortArray[i];
			 sortArray[i]=sortArray[j];
			 sortArray[j]=temp;
			 System.out.println(sortArray[i] + " " + sortArray[j]);
		 }
			}
		}
		
		System.out.println(sortArray);
	}
	
	
	
	public static void main(String args[])
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		Pattern delimiters = Pattern.compile(System.getProperty("line.separator")+"|\\s");
		scanner.useDelimiter(delimiters); 
		while(scanner.hasNextInt())
		{
			a.add(scanner.nextInt());
		}
		
		occurrences(a);
	}
	
}
