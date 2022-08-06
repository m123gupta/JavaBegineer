package Modulo;

public class RepeatNumber {
    public static void main(String[] args) {
        int A[]={1 ,2 ,3 ,1 ,1};
        int element=A[0];
        int freq=1;
        int N=A.length;
        for(int i=0;i<N;i++){

            if(freq==0){
                element=A[i];
                freq=1;
            }
            else if(A[i]==element){
                freq=freq+1;
            }
            else{
                freq=freq-1;
            }

        }
        int c=0;
        for(int i=0;i<N;i++){
            if(A[i]==element){
                c++;
            }
        }
        if(c>=N/3){
            System.out.println(element);
           // return element;
        }
        else{
            System.out.println(-1);
        }
    }
}

