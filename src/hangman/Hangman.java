package hangman;

public class Hangman {

	public static void main(String[] args) {
		boolean newRound = true;
		
		while(newRound) {
			Round round = new Round();
			Reader reader = new Reader();
			System.out.println("Let's go!");
			
			while(true) {
				if(round.isOver()) {
					Displayer.displayStickFigure(round.MAX_MISTAKES);
					System.out.printf("Sorry! Game over...\nThe word was %s.\n", round.getWord());
					newRound = reader.getNewRoundInput();
					break;
				} else if(round.isWon()){
					System.out.printf("Congratultions! You won!\nThe word was %s.\n", round.getWord());
					newRound = reader.getNewRoundInput();
					break;
				} else {
					
					round.display();
					
					guessStatus status = guessStatus.WAITING;
					
					do {
						if (status.equals(guessStatus.UNRECOGNIZED)) {
							System.out.println("Only a-z please!");
						} else if (status.equals(guessStatus.ALREADY_GUESSED)) {
							System.out.println("Already guessed! Try again.");
						}
						
						round.setCurrentGuess(reader.getInputLetter());
						status = round.checkGuess();
						
					} while (status.equals(guessStatus.UNRECOGNIZED) || status.equals(guessStatus.ALREADY_GUESSED));
						
					if (status.equals(guessStatus.CORRECT)) {
						round.setLetterAsGuessed();
						round.correctAnswer();
					} else if (status.equals(guessStatus.INCORRECT)) {
						round.setLetterAsGuessed();
						round.incorrectAnswer();
					}
					
				}
			}

		}
	}
}
