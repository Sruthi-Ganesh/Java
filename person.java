
public class person {

	/**
	 * Write a description of class person here.
	 * 
	 * @author (your name) 
	 * @version (a version number or a date)
	 */
	
	    
	private String name;
	private String friends;


	public person(String aname,String pic,double getx, double gety)
	{
	    name = aname;
	    friends =" ";
	    Picture pic = new Picture(pic);
	    pic.translate(getx,gety);
	    pic.draw();
	}

	public void addFriend(person friend)
	{
	    friends+=friend.name + " ";
	   
	}

	public void unfriend(person nonfriend)
	{
	     friends = friends.replace(nonfriend.name+" ", "");
	    }

	    public String getFriends()
	    {
	     return friends;
	    }

	    
	public static void main (String[] args)
	{
		person p =  new person("me",xyz.jpg,10,20);
		p.addFriend(p);
		
	}
}

