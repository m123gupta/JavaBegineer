package Array7June;

public class SpecialSubsequences {
    public static void solve(String A) {
        char c[]=A.toCharArray();
        int count=0;
        int res=0;
        for(int i=c.length-1;i>=0;i--) {

            if (c[i] == 'G') {
                System.out.println('g');
                count++;
            }
            else if (c[i] == 'A') {
                System.out.println('a');
                res=res+count;


            }

        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        solve("ABCGAG");
    }
}
