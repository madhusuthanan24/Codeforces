import java.util.*;
public class AB{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            char a=s.charAt(0);
            char b=s.charAt(2);
            int c=a-'0';
            int d=b-'0';
            System.out.println(c+d);
        }
    }
}