
public class LeftRotation {

	 static int[] leftRotation(int[] a, int d) {
		 for(int i=1;i<=d;i++) {
			 int temp = a[0];
			 for(int j=1;j<a.length;j++) {
				 a[j-1] = a[j];
			 }
			 a[a.length-1] = temp;
		 }
		 return a;
	    }

	    public static void main(String[] args) {
	    	int[]   a = {1,2,3,4,5};
	    	int d = 4;
	        int[] result = leftRotation(a, d);
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
	        }
	    }
}
