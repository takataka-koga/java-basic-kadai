package kadai_24;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {

	//自分のじゃんけんの手を入力するメソッド
	public  String  getMyChoice () {

	
			//自分のジャンケンの手を入力する
			System.out.println( "自分のじゃんけんの手を入力しましょう");
			System.out.println( "グーはrockのrを入力しましょう");
			System.out.println( "チョキはscissorsのsを入力しましょう");
			System.out.println( "パーはpaperのpを入力しましょう");
		
			//Scanner文
			Scanner scanner = new Scanner(System.in);
	//while文
	while(true) {
			String input = scanner.next();
			System.out.println(input);
			scanner.close();

			//例外処理
			if (input.equals("r")) {
			System.out.println("自分の手はグー");
//			scanner.close();
			return(input);

			}
			else if (input.equals("s")) {
			System.out.println("自分の手はチョキ");
//			scanner.close();
			return(input);

			}else if (input.equals("p")) {
			System.out.println("自分の手はパー");
//			scanner.close();
			return(input);

			}
			else {
						System.out.println("[エラー]指示道理に入力してください");
						continue;
			}
//--------要望　whileの条件式の入力した内容を真として出したい！------
	}
		

	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public static String getRandom() {
		String[] mchineHand = {"グー", "チョキ", "パー" };//手の配列
		//乱数で対戦相手の頑健の手を選ぶ
		double i = Math.floor(Math.random()*2);
		System.out.println(mchineHand[(int) i]);
		
		//ジャンケンクラスを実行するクラスに対戦相手のジャンケンの手を返す
		return(mchineHand[(int) i]);
		
		
		
	}
	
	//じゃんけんを行うメソッド
	public void playGame(String[]HashMap) {
		
		  HashMap<String, String> jankenMap = new HashMap<String, String>();
		  jankenMap.put("r", "グー");
		  jankenMap.put("s", "チョキ");
		  jankenMap.put("p", "パー");
		  
		  //ジャンケンの比較
	      //equals()メソッドで比較する  
		  //グー
	      if(jankenMap.get("r").equals("グー")) {
	         System.out.println("あいこです");
	      } 
	      else if(jankenMap.get("r").equals("チョキ")) {
		         System.out.println("自分の勝ちです");
	      }
	      else if(jankenMap.get("r").equals("グー")) {
		         System.out.println("自分の負けです");
	      }
	      //チョキ
	      else if(jankenMap.get("s").equals("グー")) {
		         System.out.println("自分の負けです");
	      } else if(jankenMap.get("s").equals("チョキ")) {
		         System.out.println("あいこです、");
	      }else if(jankenMap.get("s").equals("パー")) {
		         System.out.println("自分の勝ちです");
	      }
	      //パー
	      else if(jankenMap.get("p").equals("グー")) {
		         System.out.println("自分の勝ちです");
	      }else if(jankenMap.get("p").equals("チョキ")) {
		         System.out.println("自分の負けです");
	      } else if(jankenMap.get("p").equals("パー")) {
		         System.out.println("あいこです");
	      }
 
	}
		
	}

	



