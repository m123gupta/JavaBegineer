package Modulo;

public class RectangleOverLap {
    public static int solve() {
        int A = 1999;
        int res=0;
      if(A%400==0){
          res=1;
      } else if (A%4==0 && A%100!=0) {
          res=1;
      }
      else {
          res=0;
      }
return  res;
    }

    public static void main(String[] args) {


       int a= solve();
        System.out.println(a);

    }
}
