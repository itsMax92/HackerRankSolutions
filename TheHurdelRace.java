package hackerrank.solutions;


import java.util.Scanner;

public class TheHurdelRace {

    public static int hurdleRace(int k, int height[]) {
        // Write your code here
        int portion = 0;
        int max = 0;
        for (int i=0;i<height.length;i++) {
            if ( k < height[i]) {
                max = height[i] - k;
                k = height[i];
                portion = portion + max;

            }
        }
        return portion;
    }

    public static Scanner scan = new Scanner(System.in);

    public static void main(String... args) {

        System.out.println("Number of hurdle: ");
        int n = scan.nextInt();
        System.out.println("Max height a character can jump: ");
        int k = scan.nextInt();

        int height[] = new int[n];

        System.out.println("Heights arr: ");
        for (int i=0;i<n;i++) {
            height[i] = scan.nextInt();
        }


        System.out.println(hurdleRace(k,height));

    }
}
