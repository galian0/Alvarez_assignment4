package alva_problem2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {
	
	HashMap<String, Integer> wordCounter = new HashMap<>();
	
	void count(String dataFile) throws IOException {
		
		Scanner p2 = new Scanner(new File(dataFile));
		
		while(p2.hasNextLine()) {
			
			String line = p2.nextLine();
			String[] words = line.split(" ");
			
			for(int i=0; i<words.length; i++) {
				
				String word = words[i].toLowerCase();
				
				if(wordCounter.containsKey(word)) {
					wordCounter.put(word, wordCounter.get(word) + 1);
				} else {
					wordCounter.put(word, 1);
				}
			}
			
		} p2.close();
	}
	
	
	void write(String outputFile) throws IOException
	{
		FileWriter output = new FileWriter(outputFile);
		
		for(Map.Entry<String, Integer> list: wordCounter.entrySet()) {
			output.write(list.getValue() + "\t\t\t\t\t" + list.getKey() + "\n");
		}
		
		output.close();
	}
}
