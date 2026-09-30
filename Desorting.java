import java.util.*;
public class Desorting{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            boolean found=false;
            for(int i=1;i<n;i++){
                if(arr[i-1]>arr[i]){
                    found=true;
                    break;
                }
            }
            if(found){
                System.out.println("0");
                continue;
            }
            int mindiff=Integer.MAX_VALUE;
            for(int i=0;i<n-1;i++){
                mindiff=Math.min(arr[i+1]-arr[i],mindiff);
            }
            System.out.print((mindiff/2)+1);
        }
    }
}