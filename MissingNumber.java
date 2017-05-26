
public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = {1,3,2,5,7,6,9,8,10};
		int sum1 = (10*(10+1))/2;
		int sum2=0;
		for(int i=0;i<arr.length;i++) {
			sum2 += arr[i];
		}
		System.out.println("Missing Number:"+ (sum1-sum2));
	}

}
