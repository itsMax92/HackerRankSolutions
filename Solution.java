package hackerrank.solutions;

import java.io.*;
import java.util.*;


public class Solution {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        int a = Math.abs(x-z);
        int b = Math.abs(y-z);
        if (a>b) {
            return "cat B";
        }else if (a<b) {
            return "cat A";
        }else
            return "mouse C";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("Enter queries");
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = scanner.nextInt();

            int y = scanner.nextInt();

            int z = scanner.nextInt();

            System.out.println(catAndMouse(x, y, z));

        }

        scanner.close();
    }
}
