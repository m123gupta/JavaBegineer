package BitWiseOperator;

public class CountOfBits {
    public static void main(String[] args) {
        //Count Of 1 in BIT
        int N=20;
int ans=0;
        int i=3;

        while(N>0){
            int last_bit=(N&1);
            ans=ans+last_bit;
           N= N>>1;
        }
//       =================== Count X and Y bit Value
//        int ans=0;
//        int x=2,y=5;
//        ans=((1<<x)|(1<<y));


        //--------------Count Value of I bit avlue
//        String ans="";
//
//           if((N&(1<<i))==0){
//               System.out.println("0");
//           }
//           else{
//               System.out.println("1");
//           }
//--------------Count Value of I bit avlue end

        System.out.println(ans);
    }
}
