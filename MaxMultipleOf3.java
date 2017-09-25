package test;

public class MaxMultipleOf3 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,7,8,99};
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}

		if(sum%3 == 0) {
			for(int j=arr.length-1;j>=0;j--) {
				System.out.print(arr[j]);
			}
		} else {
			for(int i=0;i<arr.length;i++) {
				int temp = sum - arr[i];
				if(temp%3 == 0) {
					for(int j=arr.length-1;j>=i;j--) {
						System.out.print(arr[j]);
					}
					break;
				}
			}
		}
	}

}
