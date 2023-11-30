public class CharCheck
{
	String word = "";
	String usedChars = "";
	String allGuesses;
	char[] answer;
	char[] rightGuess;
	char guess;

	public CharCheck(String word)
	{
		this.word = word;
		answer = new char[word.length()];
		rightGuess = new char[word.length()];
		for(int i = 0; i < word.length(); i++)
		{
			answer[i] = word.charAt(i);
			rightGuess[i] = '_';
		}
	}

	public char[] getRightGuess()
	{
		return rightGuess;
	}

	public String getAllGuesses()
	{
		return allGuesses;
	}

	public boolean checkChar(char guess)
	{
		boolean correct = false;
		this.guess = guess;
		allGuesses = allGuesses + guess;
		for(int i = 0; i < answer.length; i++)
		{
			if(answer[i] == guess)
			{
				rightGuess[i] = guess;
				correct = true;
			}
		}
		return correct;
	}

}