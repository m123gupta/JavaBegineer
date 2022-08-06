package Array14june;

public class NumberOfOnes {
    public static  void solve(String A) {
       int count=0;
        for (int i=0;i<A.length();i++){
         if(A.charAt(i)=='1'){
             count++;
         }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {


        solve("010100110101");

    }
}
