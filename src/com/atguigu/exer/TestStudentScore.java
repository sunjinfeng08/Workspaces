package com.atguigu.exer;
/*
 *  浠庨敭鐩樿鍏ュ鐢熸垚缁╋紝鎵惧嚭鏈�珮鍒嗭紝骞惰緭鍑哄鐢熸垚缁╃瓑绾с�
	鎴愮哗>=鏈�珮鍒�10    绛夌骇涓衡�A鈥�  
	鎴愮哗>=鏈�珮鍒�20    绛夌骇涓衡�B鈥�
	鎴愮哗>=鏈�珮鍒�30    绛夌骇涓衡�C鈥�  
	鍏朵綑                            绛夌骇涓衡�D鈥�
	
	鎻愮ず锛氬厛璇诲叆瀛︾敓浜烘暟锛屾牴鎹汉鏁板垱寤篿nt鏁扮粍锛屽瓨鏀惧鐢熸垚缁┿�

 */
import java.util.Scanner;
public class TestStudentScore {
	public static void main(String[] args) {
		//1.鍒涘缓Scanner鐨勫璞�骞朵粠閿洏鑾峰彇瀛︾敓鐨勪釜鏁皀
		Scanner s = new Scanner(System.in);
		//System.out.println("璇疯緭鍏ュ鐢熺殑涓暟锛�);
		int count = s.nextInt();//count鐢ㄦ潵璁板綍瀛︾敓鐨勪釜鏁�
		//2.鏍规嵁杈撳叆鐨勫鐢熺殑涓暟n锛屽垱寤轰竴涓暱搴︿负n鐨刬nt鍨嬬殑鏁扮粍
		int[] scores = new int[count];
		int maxScore = 0;
		//3.渚濇浠庨敭鐩樿幏鍙杗涓鐢熺殑鎴愮哗锛屽苟璧嬬粰鐩稿簲鐨勬暟缁勫厓绱狅紝骞惰幏鍙杗涓鐢熶腑鐨勬渶楂樺垎
	//	System.out.println("璇疯緭鍏� + count + "涓垚缁╋細");
		for(int i = 0;i < scores.length;i++){
			int score = s.nextInt();//渚濇浠庨敭鐩樿幏鍙栧鐢熺殑鎴愮哗
			scores[i] = score;
			if(scores[i] > maxScore){
				maxScore = scores[i];
			}
		}
		
		//4.閬嶅巻瀛︾敓鎴愮哗鐨勬暟缁勶紝骞舵牴鎹鐢熸垚缁╀笌鏈�珮鍒嗙殑宸�锛岃祴浜堢浉搴旂殑绛夌骇锛屽苟杈撳嚭
	//	System.out.println("鏈�珮鍒嗕负锛� + maxScore);
		for(int i = 0;i < scores.length;i++){
			char level;
			if(scores[i] >= maxScore - 10){
				level = 'A';
			}else if(scores[i] >= maxScore - 20){
				level = 'B';
			}else if(scores[i] >= maxScore - 30){
				level = 'C';
			}else{
				level = 'D';
			}
			
			System.out.println("student " + i + " score is " + scores[i] + " grade is " + level);
		}
	}
}
