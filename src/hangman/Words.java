package hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Words {
	
	private List<String> words;
	
	public Words() {
		
		words = new ArrayList<String>();
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("words.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while (scanner.hasNextLine()) {
			words.add(scanner.nextLine());
		}
	}
	
	public String getWord() {
		Random random = new Random();
		int randomIndex = random.nextInt(words.size());
		String word = words.get(randomIndex);
		words.remove(randomIndex);
		
		return word;
	}
}
