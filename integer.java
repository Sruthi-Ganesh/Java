import java.util.Scanner;
public class integer {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
	int readString = 0;
	readString = scanner.nextInt();
    while(readString!=0) {
        System.out.println(readString);

        if (readString==0) { 
            System.out.println("Read Enter Key.");
        }

        if (scanner.hasNextInt()) {
            readString = scanner.nextInt();
        } else {
            readString = 0;
        }
    }
	}
}
