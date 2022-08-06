package Array9June;

public class SumOfAllSubArrays {
    public static  void solve(int[] A) {
        long sum=0;
        int N=A.length;
        for (int i=0;i<= A.length-1;i++){
            sum += (long)A[i] * (i+1) * (N-i);
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[] A = {1,2,3};

      solve(A);

    }
}
