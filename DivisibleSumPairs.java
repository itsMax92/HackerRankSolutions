package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DivisibleSumPairs {

    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int sum = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                sum = ar[i] + ar[j];
                if(sum % k == 0){
                    count++;
                }
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] ar = new int[n];

        for (int i=0;i<n;i++){
            ar[i] = scanner.nextInt();
        }

        int result = divisibleSumPairs(n , k , ar);

        System.out.println(result);
    }
}
