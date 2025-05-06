import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		Random r=new Random();
		int numbertoguess = r.nextInt(100) + 1;

		System.out.println("Welcome to the number guessing game!");
		System.out.println("Guess the number between 1 and 100 : ");

		while (true)
		{
			int guess=sc.nextInt();

			if (guess == numbertoguess)
			{
				//Thread.sleep(2000);
				System.out.println("Congrats, you guess is correct....");
				break;
			}
			else if (guess < numbertoguess)
			{
				//Thread.sleep(2000);
				System.out.println("Your guess is to low. Try again.");
			}
			else
			{
				//Thread.sleep(2000);
				System.out.println("your guess is too high. Try again.");
			}
		}
	}
}
