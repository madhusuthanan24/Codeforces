import java.util.*;

public class FashionableArray{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int arr[] = new int[n];
            int f[] = new int[101];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                f[arr[i]]++;
            }

            int max = 0;

            for (int i = 1; i < 101; i++) {
                max = Math.max(max, f[i]);
            }

            for (int l = 1; l <= max; l++) {

                for (int x = 100; x >= 1; x--) {

                    if (f[x] >= l) {
                        System.out.print(x + " ");
                    }
                }
            }

            System.out.println();
        }
    }
}