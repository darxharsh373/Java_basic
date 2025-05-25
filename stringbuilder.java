// import java.util.*;
public class stringbuilder{
public static void main(String args[]){
StringBuilder sb=new StringBuilder("");
for(char ch='a';ch<='z';ch++){
    sb.append(ch);
}//abcdefghijklmnop append means added continuously
System.out.println(sb);
}
}