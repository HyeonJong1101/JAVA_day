package kr.ac.kopo.day17.lotto;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoView4 {
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
		
		Set<Integer> lottos = new HashSet<>();
		while(lottos.size() != 6) {
			lottos.add(r.nextInt(45)+1);
		}
		
		int i=0;
		for(int num : lottos) {
			lottoNums[i++] = num;
		}
		

		return lottoNums;
	}
}
