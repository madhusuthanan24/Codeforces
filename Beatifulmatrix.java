import java.util.*;
public class Beatifulmatrix{}
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int grid[][]=new int[5][5];
        int x=0;
        int y=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                grid[i][j]=sc.nextInt();
                if(grid[i][j]==1){
                    x=i;
                    y=j;
                }
            }
        }
        int r=Math.abs(x-2);
        int c=Math.abs(y-2);
        System.out.println(r+c);
    }
}