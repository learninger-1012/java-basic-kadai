package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {

	
	Jyanken_Chapter26 jyanken =new Jyanken_Chapter26();
	String myHand =jyanken.getMyChoice();
	String machineHand =jyanken.getRandom();
	
	jyanken.playGame(myHand,machineHand);
	
 }
}