package examnation.worksapplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordMun {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		int n = 10;
		while(n>0)
		{
			String word = scan.next(); 
			int wordNum ;
			if(wordMap.containsKey(word))
			{
				wordNum = wordMap.get(word) + 1;
				wordMap.put(word, wordNum);
			}
			else
			{
				wordMap.put(word, 1);
			}
			n --;
		}
		scan.close();
		System.out.println(wordMap.values());
	}
}
