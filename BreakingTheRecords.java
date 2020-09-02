package hackerrank;

import java.util.Scanner;

public class BreakingTheRecords {
    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int highestScore = scores[0];
        int lowestScore = scores[0];
        int highCount = 0;
        int lowCount = 0;
        int[] result = new int[2];
        for (int i=0;i<scores.length;i++){
            if (scores[i] > highestScore){
                highestScore = scores[i];
                highCount++;
            }
            if (scores[i] > lowestScore){
                lowestScore = scores[i];
                lowCount++;
            }
        }
        result[0] = highCount;
        result[1] = lowCount;
        return  result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] scores = new int[n];
        for (int i=0;i<scores.length;i++){
            scores[i] = scanner.nextInt();
        }
        
        breakingRecords(scores);
    }
}
