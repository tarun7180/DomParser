
public class SubArray3 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 5, 3, 7, 9, 4, 10 };
		int[] arr2 = { 3, 7, 2 };
		int[] clone1 = arr1.clone();

		int len1 = arr1.length;
		int len2 = arr2.length;

		int count = 0;
		
		for(int i=0;i<len1;i++) {
			for(int j=0;j<len2;j++) {
				if(clone1[i] == arr2[j]) {
					clone1[i] = -1;
					count++;
				}
			}
		}
		
		if(count == len2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
