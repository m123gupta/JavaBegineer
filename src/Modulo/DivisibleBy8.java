package Modulo;

public class DivisibleBy8 {
    public static  void solve(String A) {
        String sum="";
        if(A.length()>2){
            for(int i=A.length()-1;i>=A.length()-3;i--){
                System.out.println(A.charAt(i));
                sum=A.charAt(i)+sum;
            }
        }
        else{
            sum=A;
        }
        long number = Integer.parseInt(sum);
        System.out.println(number%8==0);
    }
    public static void main(String[] args) {


        solve("4758310052942341036336679074241759053154797537802772");

    }

}
