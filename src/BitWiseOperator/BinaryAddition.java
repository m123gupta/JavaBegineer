package BitWiseOperator;

public class BinaryAddition {
    public static String addBinary(String A, String B) {
        int len1=A.length();
        int len2=B.length();

        String sum="";
        int carry=0;
        for(int i=0;i<len1||i<len2||carry!=0;i++)
        {
            int x=0;
            if(i<len1 && A.charAt(len1-1-i)=='1'){
                x=1;
            }
            int y=0;
            if(i<len2 && B.charAt(len2-1-i)=='1'){

                y=1;
            }
            int temp=x+y+carry;
            carry=temp/2;
            sum=temp%2+sum;


        }

      return sum;

    }

    public static void main(String[] args) {
        String a ="1010110111001101101000";

        String b = "1000011011000000111100110";
       String s= addBinary(a,b);
        System.out.println(s);
    }
}
