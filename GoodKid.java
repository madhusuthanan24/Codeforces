import java.util.*;
public class GoodKid{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            arr[0]++;
            long product=1;
            for(int i=0;i<n;i++){
                product*=arr[i];
            }
            System.out.println(product);
        }
    }
}