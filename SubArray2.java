
public class SubArray2 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 5, 3, 7, 9, 4, 10 };
		int[] arr2 = { 3, 7, 10 };
		int[] clone1 = arr1.clone();

		int len1 = arr1.length;
		int len2 = arr2.length;

		boolean[] flagArr = new boolean[len2];
		boolean flag = false;
		
		for(int i=0;i<len1;i++) {
			for(int j=0;j<len2;j++) {
				if(clone1[i] == arr2[j]) {
					flagArr[j] = true;
					flag = true;
					clone1[i] = -1;
				}
			}
		}
		
		if(flag) {
			for(int k=0;k<len2;k++) {
				if(!flagArr[k]) {
					flag = false;
					break;
				}
			}
		}
		
		if(flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
