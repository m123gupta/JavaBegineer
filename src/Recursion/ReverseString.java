package Recursion;

public class ReverseString {
    public static String isReverseString(String str)
    {
//        if(str.isEmpty()){
//                 return str;
//             }
//
//
//        return   isReverseString(str.substring(1))+str.charAt(0);
String s="";
int i=0;
int j=str.length();
while (j>0){
    s=str.charAt(i)+s;
    i++;
    j--;
}
return s;

    }

    public static void main(String[] args) {
        String s="monika";
        System.out.println(isReverseString(s));
    }

}
