package org.hyperskill.forBeginner.test.SquirrelsAndNuts;

import java.util.Scanner;

/**
 * N squirrels found K nuts and decided to divide them equally. Find how many nuts will be left after each of
 * the squirrels takes the equal amount of nuts.
 *
 * Input data format
 *
 * There are two positive integers N and K, each of them is not greater than 10000.
 *
 * Sample Input 1:
 *
 * 3
 * 14
 * Sample Output 1:
 *
 * 2
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var n = scan.nextInt();
        var k = scan.nextInt();
        System.out.println(k % n);
    }
}
