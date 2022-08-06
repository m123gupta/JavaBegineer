package Array9June;

public class GoodSubArray {

    public static  void solve(int[] A,int B) {
        int N = A.length;
        int c = 0;

        String tempArray="";
        for (int i = 0; i < A.length; i++) {
            int subArrayCount=1;
            int sum = A[i];
            System.out.println(A[i]);
            if((sum < B && subArrayCount%2 == 0) || (sum > B && subArrayCount%2 != 0)){

                c++;

            }
            for (int j = i+1; j<A.length; j++) {
                subArrayCount=subArrayCount+1;
                 sum +=A[j];
                if((sum < B && subArrayCount%2 == 0) || (sum > B && subArrayCount%2 != 0)){


                    c++;
                }
                }
        }
        System.out.println("c"+c);
    }






            //  System.out.println("c"+c);
        public static void main(String[] args) {
            int[] A = {1,2,3,4,5};

            solve(A,4);

        }




}
