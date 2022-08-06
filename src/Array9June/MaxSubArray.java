package Array9June;

public class MaxSubArray {
    public static  int maxSubArray(int[] C,int B) {

             int ans=Integer.MIN_VALUE;

            int sum=0;

            int N=C.length;
            int j=0;
            for (int i=0;i<= C.length-1;i++){
            sum += C[i];
                System.out.println(sum);
                if(sum>B){
                    while(sum > B) {
                        sum = sum - C[j];
                        j++;
                    }
                }
                if(sum<=B){
                    ans=Math.max(ans,sum);
                }
           }


        return (ans == Integer.MIN_VALUE)? 0 : ans;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 4, 4, 5, 5, 5, 7, 5 };

      int k=maxSubArray(A,14);
        System.out.println(k);

    }
}
