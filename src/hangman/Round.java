package hangman;

import java.util.ArrayList;
import java.util.List;

public class Round {
	final int MAX_MISTAKES = 10;
	
	private Word word;
	private List<Character> guessedLetters;
	private int mistakesCount;
	private char currentGuess;
	
	public Round() {	
		word = new Word();
		guessedLetters = new ArrayList<Character>();
		mistakesCount = 0;
	}
	
	public void display() {
		Displayer.displayStickFigure(mistakesCount);
		Displayer.displayGuessedLetters(guessedLetters);
		Displayer.displayWord(word);
	}
	
	public guessStatus checkGuess() {
		
		if(currentGuess < 97 || currentGuess > 122) {
			return guessStatus.UNRECOGNIZED;
		} else if(guessedLetters.contains(currentGuess)) {
			return guessStatus.ALREADY_GUESSED;
		} else if(word.getWord().indexOf(currentGuess) >= 0) {
			return guessStatus.CORRECT;
		} else {
			return guessStatus.INCORRECT;
		}
	}
	
	public void correctAnswer() {
		word.revealLetter(currentGuess);
	}
	
	public void incorrectAnswer() {
		mistakesCount++;
	}
	
	public void setLetterAsGuessed() {
		guessedLetters.add(currentGuess);
	}
	
	public boolean isOver() {
		return mistakesCount == MAX_MISTAKES;
	}
	
	public boolean isWon() {
		for(boolean guessedLetter : word.getWordState()) {
			if(guessedLetter == false) {
				return false;
			}
		}
		
		return true;
	}
	
	public void setCurrentGuess(char currentGuess) {
		this.currentGuess = currentGuess;
	}
	
	public String getWord() {
		return word.getWord();
	}

}
