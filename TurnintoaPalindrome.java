import java.util.*;
public class TurnintoaPalindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int k=sc.nextInt();
            char c=sc.next().charAt(0);
            StringBuilder str=new StringBuilder(sc.next());
            int min=0;
            int max=k-1;
            int count=0;
            while(min<max){
                if(str.charAt(min)!=str.charAt(max)){
                    if(str.charAt(min)==c||str.charAt(max)==c){
                        count++;
                    }
                    else{
                        count+=2;
                    }
                }
                min++;
                max--;
            }
            System.out.println(count);
        }
    }
}