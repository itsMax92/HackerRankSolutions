package hackerrank.solutions;

import java.util.Scanner;

public class TheUtopianTree {

    public static int utopianTree(int n) {

        int h = 1;
        for (int i=1;i<=n;i++) {
            if (i % 2 == 0) {h++;}
            else h = h * 2;
        }

        return h;
    }

    public static Scanner scan = new Scanner(System.in);
    public static void main(String... args) {

        System.out.println("Enter T:");
        int t = scan.nextInt();
        int n[] = new int[t];

        for (int i=0;i<t;i++) {
            n[i] = scan.nextInt();
        }
        for (int i=0;i<n.length;i++) {
            System.out.println(utopianTree(n[i]));
        }

    }
}
