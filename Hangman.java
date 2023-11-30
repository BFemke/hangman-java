import java.util.Scanner;

public class Hangman
{
	public static void main(String[] args)
	{
		Scanner inputReader = new Scanner(System.in);

		System.out.println("Hello, welcome to Hangman! \n Would you like to play? ");
		String play = inputReader.nextLine();

		while(play.equalsIgnoreCase("yes"))
		{
			boolean win = false;
			int guesses = 0;
			int correctGuess = 0;
			int wrongGuess = 0;
			String allGuesses = "";
			WordBank wordBank = new WordBank();
			System.out.println("Great! I'll generate a word and you'll try to guess it one character at a time.");

			String word = wordBank.generateWord();
			CharCheck charCheck = new CharCheck(word);
			System.out.println("=======================================");
			System.out.println("Your word is " + word.length() + " characters long.");
			while(win == false)
			{
				printRightGuess(charCheck.getRightGuess());
				System.out.println();
				if(guesses != 0)
				{
					System.out.println("You have guessed: " + allGuesses);
				}
				System.out.print("Your guess: ");
				String guessStr = inputReader.nextLine();
				char guess = guessStr.charAt(0);
				while(allGuesses.contains(guessStr)){
					System.out.println("You have already guessed " + guess + ".");
					System.out.print("Your guess: ");
					guessStr = inputReader.nextLine();
					guess = guessStr.charAt(0);
				}
				allGuesses = allGuesses + guess + ", ";
				boolean correct = charCheck.checkChar(guess);
				if(correct == true)
				{
					System.out.println(guess + " is correct!");
					guesses++;
					correctGuess++;
					if(correctGuess == word.length())
					{
						win = true;
					}
				}
				else
				{
					System.out.println("I'm sorry " + guess + " is not correct.");
					guesses++;
					wrongGuess++;
				}
			}
			System.out.print(" Congratulations ");
			printRightGuess(charCheck.getRightGuess());
			System.out.println(" is correct! \n It took you " + guesses + " guesses. \n Would you like to play again?");
			play = inputReader.nextLine();
		}
		System.out.println("Okay, goodbye.");

	}
	public static void printRightGuess(char[] rightGuess)
	{
		System.out.print("The word is: ");
		for(int i = 0; i < rightGuess.length; i++){
			System.out.print(rightGuess[i]);
		}
	}
}