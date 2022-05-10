public class pattern {
    public static void main(String[] args) {
        int rowLen=4;
        int temp=0;
        int c=1;
        for(int r=1; r<=rowLen; r++)
        {

            for(; c<=r; c++)
            {
                System.out.print( temp+c+" ");

            }
            System.out.println();

        }
//        temp=temp+c;

    }
}
