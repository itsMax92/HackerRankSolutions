package hackerrank;

public class GradingStudents {
    public static void main(String... args){
        int n = 73;
        System.out.println(test(n));
        for (int i=0;i<5;i++) {
            int num = n++;
            boolean flag = num % 5 == 0;
            System.out.println(num +"->"+ flag);
//            System.out.println(n++);
        }

    }

    /**
     * @param n input
     * @return true if multiple of 5
     */
    private static boolean test(int n) {

       return n % 5 == 0;

    }
}
