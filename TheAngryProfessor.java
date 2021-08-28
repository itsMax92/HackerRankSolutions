package hackerrank.solutions;

import java.util.Scanner;

public class TheAngryProfessor {

    public static String angryProfessor(int k, int a[]) {
        int student = 0;

        for (int i=0;i<a.length;i++) {
            if (a[i] <= 0) {
                student++;
            }
        }
        if (student >= k) {
            return "NO";
        }else
            return "YES";
    }

    public static Scanner scan = new Scanner(System.in);

    public static void main(String... args) {

        System.out.println("T:");
        int t = scan.nextInt();

        for (int i=0;i<t;i++) {

            System.out.println("N:");
            int n = scan.nextInt();
            System.out.println("K:");
            int k = scan.nextInt();
            System.out.println("Time:");
            int a[] = new int[n];

            for(int j=0;j<n;j++) {
                a[j] = scan.nextInt();
            }

            System.out.println(angryProfessor(k,a));
        }
    }
}
