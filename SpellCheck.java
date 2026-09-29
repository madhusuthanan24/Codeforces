import java.util.*;
public class SpellCheck {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        char[] target = {'T', 'i', 'm', 'u', 'r'};
        Arrays.sort(target);
        while (t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            if (n!=5){
                System.out.println("NO");
                continue;
            }
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            if (Arrays.equals(ch, target)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}