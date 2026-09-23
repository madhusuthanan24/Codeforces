import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int arr[]=new int[w+1];
        
        for(int i=1;i<=w;i++){
            arr[i]=i*k;
            n=n-arr[i];
        }
        int borrow=(n<0)?-n:0;
        System.out.print(borrow);
    
    }
}