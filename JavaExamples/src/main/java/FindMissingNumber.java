import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String args[])
    {
        int a[] = {1,2,4,5,6};
        int n=a.length;
        int total  = (n+1)*(n+2)/2;
        int listTotal = Arrays.stream(a).sum();
        System.out.println("Missing number:"+(total-listTotal));
    }
}
