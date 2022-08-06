package Array9June;

public class ContigousSybArray {
    public static void printSubArray(int[] A,int k,int l){
        for (int i=0;i<= A.length-1;i++) {

            for (int j = i; j <= A.length - 1; j++) {
                for (int p = i; p <= j; p++) {
                    System.out.print("("+i+","+p+")");
                }

            }
        }
    }
    public static  void solve(int[] A,int B) {

        int N=A.length;
        int c=0;
        for (int i=0;i<= A.length-1;i++){
            int sum=0;
            for (int j=i;j<=A.length-1;j++) {

                sum = sum + A[j];

                if(sum<=B) {

                    c=c+1;
                }
                //System.out.print("s"+sum);

                    }


                }

    }
    public static void main(String[] args) {
        int[] A = {2,5,6};

        solve(A,10);

    }
}
