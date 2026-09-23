import java.util.*;
public class NearlyLuckyNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        boolean found=false;
        int count=0;
        while(n!=0){
            long rem=n%10;
            if(rem==4 ||rem==7){
                count++;
            }
            n/=10;
        }
        if(count==0 || (count!=4 && count!=7)){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}