import java.util.Scanner;
public class apha {
	
	public static String alpha(String name) {
	    return name.replaceAll("[^A-Za-z]+","");
	}
public static void main(String args[])
{
	Scanner in = new Scanner(System.in);
	String alphaNumeral=in.nextLine();
	alphaNumeral = alpha(alphaNumeral);
	
	System.out.println(alphaNumeral);
}
}
