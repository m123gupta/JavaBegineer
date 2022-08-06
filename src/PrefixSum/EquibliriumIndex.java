package PrefixSum;

public class EquibliriumIndex {
    public static  int minimum(int a,int b){
        if(a>b){
            return  b;
        }
        else {
            return a;
        }
    }
    public static  void solve(int[] A) {
        int ps[]=new int [A.length];
        ps[0]=A[0];

        for(int i=1;i<A.length;i++){
            ps[i]= ps[i-1]+A[i];
        }
        int index=-1;

      for(int i=1;i<A.length;i++){
          int sumofleft=0;
          int sumofRight=0;
           if(i==0){
           sumofleft=0;

         }
           else {
               sumofleft = ps[i - 1];
           }
          sumofRight = ps[A.length - 1] - ps[i];
          if (sumofleft == sumofRight) {
                   if(index==-1){
                       index=i;
                   }
                   else {
                       index = minimum(index, i);
                   }

               }
//           else {
//               sumofleft = ps[i - 1];
//               sumofRight = ps[A.length - 1] - ps[i];
//               if (sumofleft == sumofRight) {
//                   if(index==-1){
//                       index=i;
//                   }
//                   else {
//                       index = minimum(index, i);
//                   }
//
//               }
//
//           }



      }

          System.out.println(index);


    }
    public static void main(String[] args) {
        int A[]={1,2,3};
        solve(A);
    }
}
