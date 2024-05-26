package kadai_026;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	

	public String getMyChoice(){
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		String humanHand = "";
		
		while (true) {
			try {
				humanHand= scanner.next();
				if ("r".equals(humanHand) ||"s".equals(humanHand)|| "p".equals(humanHand)) {
					break;
				}else {
					System.out.println("もう一度入力してください。");
					continue;			
				}
			}catch(InputMismatchException e) {
				System.out.println("もう一度入力してください。");
				scanner.next();
			}				
		}
		
		scanner.close();
		return humanHand;
	}
	
	
	public String getRandom(){
		double randomNumber= Math.floor(Math.random()*3);
		String machineHand = "";
		if (randomNumber == 0){
			machineHand = "r";
		}else if(randomNumber == 2){
			machineHand = "p";
		}else {
			machineHand = "s";
		}
		return machineHand;
	}

	public void playGame(String humanHand,String machineHand) {
		
		
		HashMap<String,String> rspMap = new HashMap<String,String>();
		
		rspMap.put("r", "グー");
		rspMap.put("s", "チョキ");
		rspMap.put("p", "パー");
		
		String humanHandJapan =rspMap.get(humanHand);
		String machineHandJapan =rspMap.get(machineHand);
		
		
		System.out.println("自分の手は"+humanHandJapan+",対戦相手の手は"+machineHandJapan);
		if (humanHandJapan==machineHandJapan){
			System.out.println("あいこです");
		}else if((humanHandJapan=="パー"&&machineHandJapan=="チョキ") ||(humanHandJapan=="チョキ"&&machineHandJapan=="グー")||(humanHandJapan=="グー"&&machineHandJapan=="パー")){
			System.out.println("自分の負けです");
		}else {
			System.out.println("自分の勝ちです");
		}
		}
}

