import java.util.*;
public class AmusingJoke{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String s3=sc.next();
        String s4=s1+s2;
        char arr1[]=s4.toCharArray();
        char arr3[]=s3.toCharArray();
        int i=0;
        Arrays.sort(arr1);
        Arrays.sort(arr3);
        if(Arrays.equals(arr1,arr3)){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}