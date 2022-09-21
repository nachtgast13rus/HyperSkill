package javaCore.functional;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;

public class SummaryExample {

    public static void Summary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Statistics:");
        System.out.println("Input numbers... press 0 to exit");
        int choice = 1;
        List<Integer> numbers = new ArrayList<>();
        while (choice != 0) {
            choice = scanner.nextInt();
            numbers.add(choice);
        }
        IntSummaryStatistics intSummaryStatistics = numbers.stream()
                .mapToInt(Integer::valueOf)
                .summaryStatistics();

        System.out.println("Count numbers: " + intSummaryStatistics.getCount());
        System.out.println("Max number: " + intSummaryStatistics.getMax());
        System.out.println("Min number: " + intSummaryStatistics.getMin());
        System.out.println("Average: " + intSummaryStatistics.getAverage());
        System.out.println("Sum this numbers: " + intSummaryStatistics.getSum());

    }
}
