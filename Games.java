import java.util.*;
public class Games{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int home[]=new int[n];
        int guest[]=new int[n];
        int i=0;
        int j=0;
        while(n-->0){
            int u=sc.nextInt();
            int v=sc.nextInt();
            home[i++]=u;
            guest[j++]=v;
        }
        int count=0;
        for(int l=0;l<home.length;l++){
            for(int r=0;r<guest.length;r++){
                if(home[l]==guest[r]){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}