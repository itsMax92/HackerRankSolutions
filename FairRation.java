package hackerrank.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FairRation {

    public static void fairRation(List<Integer> b) {
        int count = 0;
        int sum = 0;
        for (int i=0;i<b.size();i++) {
            sum = sum + b.get(i);
        }
        if (sum % 2 == 1) {
            System.out.println("NO");
        }else {
            for (int i = 0; i < b.size(); i++) {
                if (b.get(i) % 2 != 0) {
                    b.set(i, b.get(i) + 1);
                    b.set(i + 1, b.get(i + 1) + 1);
                    count += 2;
                }
            }
            System.out.println(count);
        }
    }

    public static void main(String... args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> b = new ArrayList<>();
        int n = scan.nextInt();
        for (int i=0;i<n;i++) {
            b.add(scan.nextInt());
        }
        fairRation(b);

    }
}
