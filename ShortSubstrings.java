import java.util.*;
public class ShortSubstrings{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            String s=sc.next();
            String ans="";
            ans+=s.charAt(0);
            Stack<Character>stack=new Stack<>();
            for(int i=1;i<s.length()-1;i++){
                if(stack.isEmpty()){
                    stack.push(s.charAt(i));
                }
                else{
                    if(stack.peek()==s.charAt(i)){
                        ans+=stack.pop();
                    }
                    else{
                        stack.push(s.charAt(i));
                    }
                }
            }
            ans+=s.charAt(s.length()-1);
            System.out.println(ans);
        }
    }
}