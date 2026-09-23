import java.util.*;
public class Beatifulyear{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(true){
            n++;
            String s=String.valueOf(n);
            HashSet<Character> set=new HashSet<>();
            for(int i=0;i<s.length();i++){
                set.add(s.charAt(i));
            }
            if(set.size()==s.length()){
                System.out.println(n);
                break;
            }
        }
    }
}