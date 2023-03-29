package kr.ac.kopo.day17.lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoView3 {
	private Random r = new Random();

	public void start() {
		System.out.println("게임수 입력");
		
		int gameCnt = 10;
		for(int i=1; i<=gameCnt; i++) {
			System.out.println("게임"+i+":" + Arrays.toString(getLotto()));
		}
	}
	
	private int[] getLotto() {
		
		int[] lottoNums = new int[45];
		int[] lottoNums2 = new int[6];
		
		for(int i=0; i<lottoNums.length; i++) {
			lottoNums[i] = i+1;
		}
		
		for(int i=0; i<6; i++) {
			int ran = r.nextInt(45-i);
			
			int value = lottoNums[ran];
			
			lottoNums[ran] = lottoNums[44-i];
			lottoNums[44-i] = value;
			//lottoNums2[i] = value; 
		}
		
		System.arraycopy(lottoNums, lottoNums.length-lottoNums2.length, lottoNums2, 0, lottoNums2.length);

		return lottoNums2;
	}
}
