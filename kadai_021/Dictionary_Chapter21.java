package kadai_021;
import java.util.HashMap;
import java.util.Objects;

public class Dictionary_Chapter21 {
	public void chackWord(String word) {
	
		HashMap<String,String> wordMap = new HashMap<String,String>();
	
		wordMap.put("apple", "りんご");
		wordMap.put("peach", "桃");
		wordMap.put("banana", "バナナ");
		wordMap.put("lemon", "レモン");
		wordMap.put("pear", "梨");
		wordMap.put("kiwi", "キウィ");
		wordMap.put("strawberry", "いちご");
		wordMap.put("grape", "ぶどう");
		wordMap.put("muscat", "マスカット");
		wordMap.put("cherry", "さくらんぼ");
		
		if (Objects.isNull(wordMap.get(word))){
			System.out.println(word+"は辞書に存在しません");
		}else{
			System.out.println(word+"の意味は"+wordMap.get(word)+"です");
		}
		
	}
}
