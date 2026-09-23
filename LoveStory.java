import java.util.*;
class LoveStory{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="codeforces";
        while(n-->0){
            String str=sc.next();
            int count=0;
            for(int i=0;i<str.length();i++){
                if(s.charAt(i)!=str.charAt(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}