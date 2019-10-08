
/**
 * @author Celine Cheung
 * Class ID: CSE 360 - Intro to Software Engineering- Monday 
 * Assignment #2
 * Description: Learning to use Git with a simple AddingMachine.java class
 */
public class AddingMachine
{

	private int total;
	private String n = "0";
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) 
	{
		total = total + value;
		n = n + " + " + value;
		
	}
	
	public void subtract (int value) 
	{
		total = total - value;
		n = n + " - "+ value;
	}
		
	public String toString () {
		return n;
	}

	public void clear() 
	{
		total= 0;
		n = "0";
	}

}
