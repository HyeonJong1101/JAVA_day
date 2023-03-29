package kr.ac.kopo.day17.lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoView {
	private Random r = new Random();

	public void start() {
		System.out.println("게임수 입력");
		
		int gameCnt = 10;
		for(int i=1; i<=gameCnt; i++) {
			System.out.println("게임"+i+":" + Arrays.toString(getLotto()));
		}
	}
	
	private int[] getLotto() {
		
		int[] lottoNums = new int[6];
		for(int i = 0; i < lottoNums.length; ) {
			lottoNums[i] = r.nextInt(45) + 1;
			boolean bool = true;
			for(int j = 0; j < i; j++) {
				if(lottoNums[i] == lottoNums[j]) {
					System.out.print('!');
					bool = false;
					break;
				}
			}
			if(bool) {
				i++;
			}
		}

		return lottoNums;
	}
}
