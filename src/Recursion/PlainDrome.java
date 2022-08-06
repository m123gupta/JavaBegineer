package Recursion;

public class PlainDrome {
    public static boolean isPalRec(String st,int s,int e){
        if(s==e){
            return  true;
        }
        if(st.charAt(s)!=st.charAt(e)){
            return  false;
        }
        if(s<e+1){
            return  isPalRec(st,s+1,e-1);
        }
        return true;
    }
    public static boolean isPalindrome(String str)
    {
        int n = str.length();

        if (n == 0)
            return true;

        return isPalRec(str, 0, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("namman"));
    }
}
