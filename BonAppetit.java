package HackerRankSolutions;

import java.util.Scanner;

public class BonAppetit {

    static void bonAppetit(int arr[], int k , int b){
        int total = 0;
        for (int i=0;i<arr.length;i++){
            if (i != k){
                total += arr[i];
            }
        }
        int bActual = total / 2;
        int bCharged = b;
        if (bActual == bCharged){
            System.out.println("Bon Appetit");
        }else {
            System.out.println(bCharged - bActual);
        }
    }

    public static void main(String... args){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        int b = scan.nextInt();

        bonAppetit(arr,k,b);
    }
}
