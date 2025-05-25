import java.util.*;
public class substring{
    public static String sub_string(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
              substr+=str.charAt(i);
        }
        return substr;

    }
public static void main(String args[]){
//substring
String str="helloWorld";
System.out.println(str.substring(0,5));
// System.out.println(sub_string(str,0,5));
}
}
