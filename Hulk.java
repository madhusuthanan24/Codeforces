import java.util.*;
public class Hulk{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s1="I hate";
        String s2="I love";
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.print(s1+" ");
            }
            else {
                System.out.print(s2+" ");
            }
            if(i==n-1){
                System.out.print("it ");
            }
            else{
                System.out.print("that ");
            }
        }
    }
}