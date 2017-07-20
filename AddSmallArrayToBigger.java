package test;

import java.util.ArrayList;
import java.util.List;

public class AddSmallArrayToBigger {

	public static void main(String[] args) {
		List<Integer> aList = new ArrayList<Integer>();
		List<Integer> bList = new ArrayList<Integer>();
		List<Integer> cList = new ArrayList<Integer>();
		aList.add(1);
		aList.add(3);
		aList.add(5);
		aList.add(6);
		bList.add(2);
		bList.add(4);

		int bLength = bList.size();
		int aLength = aList.size();
		
		for(int i=0,j=0;i<aLength||j<bLength;) {
			int aTemp = 0;
			int bTemp = 0;
			if(i<aLength) {
				aTemp = aList.get(i);
			}
			if(j<bLength) {
				bTemp = bList.get(j);
			}
			if(aTemp < bTemp && i<aLength) {
				cList.add(aTemp);
				i++;
				continue;
			} else if(aTemp > bTemp && j<bLength) {
				cList.add(bTemp);
				j++;
				continue;
			} else if (aTemp == bTemp) {
				cList.add(aTemp);
				i++;
				j++;
				continue;
			} else if(i<=aLength && j>=bLength) {
				cList.add(aTemp);
				i++;
				continue;
			} else if(i>=aLength && j<=bLength) {
				cList.add(bTemp);
				j++;
				continue;
			}
		}
		for(int k=0;k<cList.size();k++) {
			System.out.print(cList.get(k) + " ");
		}
	}
}
