import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class NonDuplicateNumber {

	public static void main(String[] args) {
		int[] arr = {1,3,2,5,7,6,9,8,10,1,3,2,5,7,6,9,8,10,4};
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(countMap.containsKey(arr[i])) {
				int count = countMap.get(arr[i]);
				count++;
				countMap.put(arr[i], count);
			} else {
				countMap.put(arr[i], 1);
			}
		}
		
		Set<Integer> keySet = countMap.keySet();
		for(Integer key : keySet) {
			int count = countMap.get(key);
			if(count == 1) {
				System.out.println("Non duplicate number: "+key);
			}
		}
	}

}
