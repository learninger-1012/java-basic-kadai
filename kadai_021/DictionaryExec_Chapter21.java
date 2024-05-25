package kadai_021;

public class DictionaryExec_Chapter21{
	public static void main(String[] args) {
		
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		String[] wordList = {"apple","banana","grape","orange"}; 
	
		for (int j=0;j<wordList.length;j++) {
			dictionary.chackWord(wordList[j]);
		}
		
}}