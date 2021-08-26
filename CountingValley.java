package hackerrank.solutions;

import java.util.Scanner;

public class CountingValley {

    public static int valleyCounting(int steps, String path) {
        int level = 0;
        int valleyCount = 0;

        for (char c: path.toCharArray()) {
            if (c == 'U') level++;
                else level--;

                if (level == 0 && c == 'U') valleyCount++;
        }
        return valleyCount;
    }

    public static Scanner scan = new Scanner(System.in);

    public static void main(String... args) {

        System.out.println("Enter Steps");
        int steps = scan.nextInt();
        System.out.println("Enter String");
        scan.nextLine();
        String path = scan.nextLine();


        System.out.println("Valley Count: "+valleyCounting(steps , path));
        scan.close();

    }
}
