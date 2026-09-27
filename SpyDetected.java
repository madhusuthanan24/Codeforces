import java.util.*;
public class SpyDetected{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            if(arr[0]!=arr[1]){
                if(arr[0]==arr[2]){
                    System.out.println(2);
                }
                else{
                    System.out.println(1);
                }
            }
            else{
                for(int i=2;i<n;i++){
                    if(arr[i]!=arr[0]){
                        System.out.println(i+1);
                        break;
                    }
                }
            }
        }
    }
}