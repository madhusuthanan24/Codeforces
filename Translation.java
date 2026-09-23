import java.util.*;
public class Translation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        char c[]=s1.toCharArray();
        int min=0;
        int max=c.length-1;
        while(min<max){
            char temp=c[min];
            c[min]=c[max];
            c[max]=temp;
            min++;
            max--;
        }
        String ans=new String(c);
        if(ans.equals(s)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}