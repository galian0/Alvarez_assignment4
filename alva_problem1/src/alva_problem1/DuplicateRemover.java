package alva_problem1;

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {
	
	Set<String> uniqueWords;
	
	void remove(String dataFile) throws IOException {
		
			uniqueWords = new HashSet<>();
			
			Scanner p1 = new Scanner(new File(dataFile));
			
			while(p1.hasNextLine()) {
				
				String line = p1.nextLine();
				String[] words = line.split(" ");
				
				for(int i=0; i<words.length; i++) {
					String word = words[i].toLowerCase();
					uniqueWords.add(word);
				}
				
			}
			p1.close();
	}
	
	void write(String outputFile) throws IOException
	{
		FileWriter output = new FileWriter(outputFile);
		
		for(String list:uniqueWords) {
			output.write(list+"\n-------------\n");
		}
		
		output.close();
	}
}
