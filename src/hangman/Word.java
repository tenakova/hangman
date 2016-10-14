package hangman;

public class Word {
	
	private String word;
	private boolean[] wordState;
	
	
	public Word() {
		word = Round.words.getWord();
		
		wordState = new boolean[word.length()];
		makeState();
	}
	
	public void makeState() {
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == word.charAt(0) 
					|| word.charAt(i) == word.charAt(word.length()-1)) {
				wordState[i] = true;
			}
		}
	}
	
	public void revealLetter(char currentGuess) {
		int guessedIndex = word.indexOf(currentGuess);
		wordState[guessedIndex] = true;
		
		while(word.indexOf(currentGuess, guessedIndex+1) >= 0) {
			int newGuessedIndex = word.indexOf(currentGuess, guessedIndex+1);
			wordState[newGuessedIndex] = true;
			guessedIndex = newGuessedIndex;
		}	
	}
	
	public String getWord() {
		return word;
	}
	
	public boolean[] getWordState() {
		return wordState;
	}

}
