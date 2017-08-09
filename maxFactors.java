import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
public class maxFactors {
	
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		Pattern delimiters = Pattern.compile(System.getProperty("line.separator")+"|\\s");
		scanner.useDelimiter(delimiters); 
		String news = " ";
		 
		    String readString = scanner.nextLine();
		    while(readString!=null) {
		        System.out.println(readString);

		        if (readString.isEmpty()) { 
		            System.out.println("Read Enter Key.");
		        }

		        if (scanner.hasNextLine()) {
		            readString = scanner.nextLine();
		        } else {
		            readString = null;
		        }
		    }
		

}
}
