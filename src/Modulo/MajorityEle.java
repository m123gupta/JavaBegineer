package Modulo;

public class MajorityEle {

    public static void main(String[] args) {
        int A[]={2,1,1};
        int element=-1;
        int freq=0;
        int N=A.length;

        for(int i=0;i<N;i++){

            if(freq==0){
                element=A[i];
                freq=1;
            }
            else {
                if (A[i] == element) {
                    freq++;
                } else {
                    freq--;
                }
            }

        }
        int c=0;
        for(int i=0;i<N;i++){
            if(A[i]==element){
                c++;
            }
        }

        if(c>N/2){
            System.out.println(element);
           // return element;
        }
        else{
            System.out.println(0);
          //  return -1;
        }
    }
}
