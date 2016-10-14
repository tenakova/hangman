package hangman;

import java.util.List;

public class Displayer {
	
	static public void displayWord(Word word) {
		String currentWord = word.getWord();
		boolean[] currentWordState = word.getWordState();
		for (int i = 0; i < currentWord.length(); i++){
			if (currentWordState[i]) {
				System.out.print(currentWord.charAt(i));
			} else {
				System.out.print(" _ ");
			}
		}
		System.out.print("\n");	
	}
	
	static public void displayGuessedLetters(List<Character> guessedLetters) {
		System.out.print("Letters you've tried: ");
		for (char guessedLetter : guessedLetters) {
			System.out.printf(" %c ", guessedLetter);
		}
		System.out.print("\n");
	}
	
	static public void displayMistakes(int mistakesCount) {
		System.out.println("Mistakes: " + mistakesCount);
	}
}
