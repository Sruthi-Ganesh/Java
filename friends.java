import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class friends here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class friends
{
    // instance variables - replace the example below with your own
    private int n;
    private static ArrayList<String> friends,friendOfFriends;
    private static ArrayList<Integer> numberOfFriends;

    /**
     * Constructor for objects of class friends
     */
    public friends()
    {
        //Initialize instance variables
    	
    	
    	
    	
        
    }

    public static void main(String[] args)

    {
    	friends = new ArrayList<String>();
    	friendOfFriends = new ArrayList<String>();
    	numberOfFriends = new ArrayList<Integer>();
    	
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        
        for(int j=0;j<num;j++)
        {
        
        String friend = in.nextLine();
        friends.add(friend);
        int number = Integer.parseInt(in.nextLine());
      
        
        for(int i=0;i<number;i++)
        {
        String friends = in.nextLine();
        friendOfFriends.add(friends);
    }
    
        System.out.println(friends.toString()+ friendOfFriends.toString());
        
}
        
        for(int i=0;i<friendOfFriends.size();i++)
        {
        	int flag=0;
        	for(int j=0;j<friends.size();j++)
        	{
        		if(!friendOfFriends.get(i).equals(friends.get(j)))
        		{
        			int k=0;
        			while(k<friendOfFriends.size())
        			{
        				if(friendOfFriends.get(i).equals(friendOfFriends.get(k)))
        				{
        					
        					break;
        					
        				}
        				k++;
        		
        			}
        			flag++;
        		}
        		
        	}
        	if(flag==friends.size())
        	{
        		System.out.println(friendOfFriends.get(i));
        	}
        }
    }
    
    
}
