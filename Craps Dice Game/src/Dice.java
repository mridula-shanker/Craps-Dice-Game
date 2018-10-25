/**
 * 
 * @author mshanker22
 *
 */
public class Dice 
	{
	private int numRolls;
	
	public Dice()
	{
		numRolls=0;
	}
	
	public int roll()
	{
		numRolls++;
		int roll = (int)(Math.random()*6+1);
		return roll;
	}
	
	public void reset()
	{
		numRolls = 0;
	}
	
	public int getNumRolls()
	{
		return numRolls;
	}
	
}