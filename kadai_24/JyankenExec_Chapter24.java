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

public class JyankenExec_Chapter24 {

	public static void main(String[] args) {
		//Jyanken_Chapter24クラスの呼び出し
		Jyanken_Chapter24 JyankenClass  = new Jyanken_Chapter24();
		
		//各種メソッドの呼び出し
		JyankenClass.getMyChoice();
		
		//自分の手が返り値として欲しい
		
		JyankenClass.getRandom();
		
		//乱数での手が返り値として欲しい
		
		
		JyankenClass.playGame(args);
		
		//上記２つのメソッドから比較した結果の返り値が欲しい

	}
}
