import java.util.*;
public class WordCapitalization{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char ch[]=str.toCharArray();
        ch[0]=Character.toUpperCase(ch[0]);;
        System.out.println(new String(ch));
    }
}