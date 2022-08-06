package Recursion;

public class FooBarChallange {
    public static int bar(int a,int b)
    {

        if(b==0){
            return 0;
        }
        return (a +bar(a,b-1));


    }
    public static int foo(int a,int b)
    {
        System.out.println(b);
        if(b==0){
            return 1;
        } else if (b%2==0) {
            return foo(a*a,b/2);

        }
        else {
            return a*foo(a*a,(b-1)/2);
        }

    }
    public static void main(String[] args) {
        System.out.println(foo(2,10));
    }
}
