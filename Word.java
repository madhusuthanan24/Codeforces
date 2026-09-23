import java.util.*;
public class Word{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int small=0;
        int big=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<='z' && s.charAt(i)>='a'){
                small++;
            }
            else if(s.charAt(i)<='Z' && s.charAt(i)>='A'){
                big++;
            }
        }
        if(small>big){
            System.out.print(s.toLowerCase());
        }
        else if(small==big){
            System.out.print(s.toLowerCase());
        }
        else if (big>small){
            System.out.print(s.toUpperCase());
        }
    }
}