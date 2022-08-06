package Array9June;

public class LargestSumSubArray {
    public static int max(int a,int b){
        if(b>a){
            return b;
        }
        else {
            return a;
        }
    }
    public static  int maxSubArray(int[] A) {
        int largest=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum=sum+A[i];
            if (largest<sum) {
                largest=sum;
                
            }
            if(sum<0){
                sum=0;
            }

        }


            return largest;



    }
    public static void main(String[] args) {
       int[] A = {-163, -20};

       int k= maxSubArray(A);
        System.out.println(k);
    }
}
