import java.util.*;
public class YourName{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            String s1=sc.next();
            char c[]=s.toCharArray();
            char c1[]=s1.toCharArray();
            Arrays.sort(c);
            Arrays.sort(c1);
            if(Arrays.equals(c, c1)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}