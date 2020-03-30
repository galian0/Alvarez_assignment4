package alva_problem1;

import java.io.IOException;

public class Application {
	
	public static void main(String[] args) {
		DuplicateRemover duplicateRemover = new DuplicateRemover();
		try {
			duplicateRemover.remove("problem1.txt");
			duplicateRemover.write("unique_words.txt");
		} catch(IOException e) {
			System.out.println("Error occured ");
			e.printStackTrace();
		}
	}
}
