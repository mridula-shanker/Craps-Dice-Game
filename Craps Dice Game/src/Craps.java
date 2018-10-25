import java.util.Scanner;

/**
 * 
 * @author Mridula Shanker
 * Craps Game
 * Period 6
 */

public class Craps 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();

		System.out.print("Welcome  to Craps! Please press \"y\" to begin"); 
		String ans;
		ans = in.nextLine();
		while (ans.equals("y"))
		{
			int roll1 = dice1.roll();
			int roll2 = dice2.roll();
			int point = 0;
			boolean afterFirst = false;
			System.out.println("You rolled a " + roll1 + " and a " + roll2);
			if (roll1 + roll2 == 7 || roll1 + roll2 == 11)
			{
				System.out.println("You win!");
			}
			else if (roll1 + roll2 == 2 || roll1 + roll2 == 12)
			{
				System.out.println("You lose...");
			}
			else 
			{
				point = roll1 + roll2;
				System.out.println("Your target point is " + point);
				afterFirst = true;
			}
			
			
			while (afterFirst == true) 
			{
				System.out.print("Press enter to continue. ");
				in.nextLine();
				roll1 = dice1.roll();
				roll2 = dice2.roll();
				System.out.println("You rolled a " + roll1 + " and a " + roll2);
				if (roll1+roll2 == point) 
				{
					System.out.println("You win!");
					afterFirst = false;
				}
				else if (roll1+roll2 == 7) 
				{
					System.out.println ("You lose...");
					afterFirst = false;
				}
				
			}
			
			System.out.print("Would you like to play again? Please enter \"y\" to restart or \"n\" to quit "); 
			ans = in.nextLine();
			if(ans.equals("n")) 
			{
				System.out.println("Thanks for playing!");
			}
		}
		
	}

}

