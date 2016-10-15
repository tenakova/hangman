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
	
	static public void displayStickFigure(int mistakesCount) {
		StringBuilder stickman = new StringBuilder();
		switch (mistakesCount) {
		case 1: stickman.append("                   \n"); 
				stickman.append("                   \n");
				stickman.append("                   \n");
				stickman.append("                   \n");
				stickman.append("                   \n");
				stickman.append("                   \n");
				stickman.append("                   \n");
				stickman.append("                   \n");
				stickman.append("_________          \n");
				break;
		
		case 2: stickman.append("                   \n"); 
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append("_|_______          \n");
				break;
		
		case 3: stickman.append(" ________________  \n"); 
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append("_|_______          \n");
				break;
		
		case 4: stickman.append(" ________________  \n"); 
				stickman.append(" |         |       \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append("_|_______          \n");
				break;

		case 5: stickman.append(" ________________  \n"); 
				stickman.append(" |         |       \n");
				stickman.append(" |        ( )      \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append("_|_______          \n");
				break;
		
		case 6: stickman.append(" ________________  \n"); 
				stickman.append(" |         |       \n");
				stickman.append(" |        ( )      \n");
				stickman.append(" |         |       \n");
				stickman.append(" |         |       \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append("_|_______          \n");
				break;
		
		case 7: stickman.append(" ________________  \n"); 
				stickman.append(" |         |       \n");
				stickman.append(" |        ( )      \n");
				stickman.append(" |        /|       \n");
				stickman.append(" |         |       \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append("_|_______          \n");
				break;
		
		case 8: stickman.append(" ________________  \n"); 
				stickman.append(" |         |       \n");
				stickman.append(" |        ( )      \n");
				stickman.append(" |        /|\\     \n");
				stickman.append(" |         |       \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append("_|_______          \n");
				break;
				
		case 9: stickman.append(" ________________  \n"); 
				stickman.append(" |         |       \n");
				stickman.append(" |        ( )      \n");
				stickman.append(" |        /|\\     \n");
				stickman.append(" |         |       \n");
				stickman.append(" |        /        \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append("_|_______          \n");
				break;
			
		case 10: stickman.append(" ________________  \n"); 
				stickman.append(" |         |       \n");
				stickman.append(" |        ( )      \n");
				stickman.append(" |        /|\\     \n");
				stickman.append(" |         |       \n");
				stickman.append(" |        / \\     \n");
				stickman.append(" |                 \n");
				stickman.append(" |                 \n");
				stickman.append("_|_______          \n");
				break;
		}
		System.out.println(stickman);
	}
}
