package warmup;

import java.util.Scanner;

/**
 * The task is to scan two numbers from STDIN, and print the sum A+B on STDOUT
 * <p/>
 * Created by Varun on 17-02-2015.
 */
public class SolveMeFirst {

    /**
     *
     * @param a first integer
     * @param b second integer
     * @return sum of a + b
     */
    static int solveMeFirst(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}
