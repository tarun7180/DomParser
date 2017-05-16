
public class SubArray1 {

	public static void main(String[] args) {
		int[] arr1= {1,2,5,3,7,4,9,10};
		int[] arr2={3,7,4};

		int len1 = arr1.length;
		int len2 = arr2.length;
		
		boolean flag = false;
		
		for(int i=0;i<len1;i++){
			if(arr1[i] == arr2[0]) {
				flag = check(arr1,arr2,len1,len2,i);
				if(flag) {
					break;
				}
			}
		}
		System.out.println(flag);
	}

	private static boolean check(int[] arr1, int[] arr2, int len1, int len2,
			int i) {
		for(int j=i;j<len1;j++) {
			for(int k=1;k<len2;k++) {
				if(arr1[j] != arr2[k]) {
					return false;
				}
			}
		}
		return true;
	}

}
