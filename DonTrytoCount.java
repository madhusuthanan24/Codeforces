import java.util.*;
public class DonTrytoCount{
    public static int find(String s,String x){
        int count=0;
        while(!s.contains(x)){
            s=s+s;
            count++;
            if(x.length()*3<s.length()&&!s.contains(x)){
                return -1;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int r=sc.nextInt();
            int m=sc.nextInt();
            String s=sc.next();
            String x=sc.next();
            System.out.println(find(s,x));
        }
    }
}