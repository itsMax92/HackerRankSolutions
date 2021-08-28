package hackerrank.solutions;

import java.util.Scanner;

public class TheDesignerPdfViewer {

    public static int designerPdf(int h[], String word) {
        int max = 0;

        for (int i=0;i<word.length();i++) {
            char tempChar = word.charAt(i);

            if (h[tempChar - 97] > max)
                max = h[tempChar - 97];
        }

        return max*word.length();
    }

    public static Scanner scan = new Scanner(System.in);

    public static void main(String... args) {

        int h[] = new int[26];

        System.out.println("Height: ");
        for (int i=0;i<h.length;i++) {
            h[i] = scan.nextInt();
        }
        scan.nextLine();
        System.out.println("Word: ");
        String word = scan.nextLine();

        System.out.println(designerPdf(h,word));

    }
}
