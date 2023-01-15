package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int R;

        char[] S;

        for(int i = 0; i < T; i++){
            R = sc.nextInt();
            S = sc.next().toCharArray();

            for(int x = 0, cnt=S.length; x<cnt; x++){
                for(int y = 0; y<R; y++){
                    System.out.print(S[x]);
                }
            }
            System.out.println();
        }
    }
}