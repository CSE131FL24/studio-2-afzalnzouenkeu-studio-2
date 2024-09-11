package studio2;

import java.util.Scanner;

public class Ruin 
{


	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Amount of money to start with: ");
		double startAmount = in.nextDouble();
		System.out.println("Win Chance: ");
		double winChance = in.nextDouble();
		System.out.println("Win Limit:");
		double winLimit = in.nextDouble();

		int win = (int) (Math.random()* 100) + 1;
		
		double i = 0.0;

		for (i = startAmount; i <= winLimit || i <= 0; i++)
		{
			win = (int) (Math.random()* 100) + 1;
			if (win <= winChance)
			{
				System.out.println("you won");
				i = i + 1;
				System.out.println("you have" + i);
			}
			else
			{
				System.out.println("You Lost");
				i = i - 1;
				System.out.println("you have" + i);
			}
		}
		if (i == winLimit)
		{
			System.out.println("Success!");
		}

		if (i <= 0)
		{
			System.out.println("Ruin!");
		}
	}
}
