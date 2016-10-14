package hangman;

import java.util.Scanner;

public class Reader {
	
	private Scanner reader;
	
	Reader() {
		reader = new Scanner(System.in);
	}
	
	public char getInputLetter() {
		System.out.print("Give me a letter: ");
		return reader.next(".").charAt(0);
	}
	
	public boolean getNewRoundInput() {
		System.out.print("Play again? y/n: ");
		char answer = reader.next(".").charAt(0);
		
		if(answer == 'y') return true;
		else if(answer == 'n') return false;
		else return getNewRoundInput();
	}

}
