import java.util.*;
public class PrependandAppend{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int l=sc.nextInt();
            String s=sc.next();
            int min=0;
            int max=s.length()-1;
            int count=0;
            while(min<max&&s.charAt(min)!=s.charAt(max)){
                min++;
                max--;
            }   
            int ans=Math.max(0,max-min+1);
            System.out.println(ans);
        }
    }
}