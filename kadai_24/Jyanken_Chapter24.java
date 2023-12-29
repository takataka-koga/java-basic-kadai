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
		
			Scanner scanner = new Scanner(System.in);
			String myHand = "z";

	//while文
	while(true) {
			//Scanner文
			 myHand = scanner.next();
//			System.out.println(myHand);

			//例外処理
			if (myHand.equals("r")) {
//				System.out.println("自分の手はグー");
//				scanner.close();
//				return(input);
				break;
			}
			else if (myHand.equals("s")) {
//				System.out.println("自分の手はチョキ");
//				scanner.close();
//				return(input);
				break;
			}
			else if (myHand.equals("p")) {
//				System.out.println("自分の手はパー");
//				scanner.close();
//				return(input);
				break;

			}
			else {
						System.out.println("[エラー]指示通りに入力してください");
			}
//--------要望　whileの条件式の入力した内容を真として出したい！------
	}
	scanner.close();	
	return(myHand);


	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		String[] machineHand = {"グー", "チョキ", "パー" };//手の配列
		//乱数で対戦相手の頑健の手を選ぶ
		int i =(int) (Math.floor(Math.random()*3));
//		System.out.println(machineHand[i]);
		
		//ジャンケンクラスを実行するクラスに対戦相手のジャンケンの手を返す
		return(machineHand[i]);
		
		
		
	}
	
	//じゃんけんを行うメソッド
	public void playGame(HashMap<String, String>jankenMap) {		
		  //ジャンケンの比較
	      //equals()メソッドで比較する  
		  //グー
		if(jankenMap.get("r") != null) {
		       if(jankenMap.get("r").equals("グー")) {
			         System.out.println("あいこです");
		       }     
		      else if(jankenMap.get("r").equals("チョキ")) {
			         System.out.println("自分の勝ちです");
		      }
		      else if(jankenMap.get("r").equals("パー")) {
			         System.out.println("自分の負けです");
		      }	
		}
		else if(jankenMap.get("s") != null) {
		      //チョキ
		     if(jankenMap.get("s").equals("グー")) {
			         System.out.println("自分の負けです");
		      } else if(jankenMap.get("s").equals("チョキ")) {
			         System.out.println("あいこです、");
		      }else if(jankenMap.get("s").equals("パー")) {
			         System.out.println("自分の勝ちです");
		      }
		}
		else {
		      //パー
		      if(jankenMap.get("p").equals("グー")) {
			         System.out.println("自分の勝ちです");
		      }else if(jankenMap.get("p").equals("チョキ")) {
			         System.out.println("自分の負けです");
		      } else if(jankenMap.get("p").equals("パー")) {
			         System.out.println("あいこです");
		      }
		}
	}
		
	}

	



