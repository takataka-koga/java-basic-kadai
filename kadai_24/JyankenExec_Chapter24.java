/*---出力結果イメージ-----
 自分のじゃんけんの手を入力しましょう
グーはrockのrを入力しましょう
チョキはscissorsのsを入力しましょう
パーはpaperのpを入力しましょう
p
自分の手はパー,対戦相手の手はグー
自分の勝ちです
*/

package kadai_24;

import java.util.HashMap;

public class JyankenExec_Chapter24 {

	public static void main(String[] args) {
		//Jyanken_Chapter24クラスの呼び出し
		Jyanken_Chapter24 jyankenClass  = new Jyanken_Chapter24();
		
		//各種メソッドの呼び出し
		String myHand = jyankenClass.getMyChoice();
//		System.out.println(myHand);
		
		//自分の手が返り値として欲しい
		
		String machineHand = jyankenClass.getRandom();
		
		System.out.println("自分の手は"+(myHand.equals("r") ? "グー" : myHand.equals("s")? "チョキ" :  "パー") 
+"対戦相手の手は"+machineHand);
		 HashMap<String, String> jankenMap = new HashMap<String, String>();
		jankenMap.put(myHand, machineHand);
//		System.out.println(jankenMap);
		
		 
		jyankenClass.playGame(jankenMap);
		
		//上記２つのメソッドから比較した結果の返り値が欲しい

	}
}
