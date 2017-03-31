package tesco;

import java.util.Scanner;

public class AppleCount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numTestCases = in.nextInt();
		for(int i=1;i<=numTestCases;i++) {
			int farmNum = in.nextInt();
			int initialEnergy = in.nextInt();
			int[] milkArr = new int[farmNum];
			int[] appleArr = new int[farmNum];
			for(int j=0;j<farmNum;j++) {
				milkArr[j] = in.nextInt();
			}
			for(int j=0;j<farmNum;j++) {
				appleArr[j] = in.nextInt();
			}
			int appleCount = getAppleCount(farmNum,initialEnergy,milkArr,appleArr);
			System.out.println(appleCount);
		}

	}

	private static int getAppleCount(int farmNum, int initialEnergy,
			int[] milkArr, int[] appleArr) {
		int appleCount = 0;
		for(int i=0;i<farmNum;i++) {
			if(i==0) {
				initialEnergy += milkArr[i];
			} else {
				if(initialEnergy>1 && i<farmNum) {
					appleCount += appleArr[i];
				} else {
					initialEnergy += milkArr[i];
				}
			}
		}
		return appleCount;
	}

}
