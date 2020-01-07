package hw.task3;

import java.util.Random;

/**
 * SLA of complex infrastructure
 */
public class Main {

    private static final int NUM_ATTEMPTS = 1_000_000_000;
    private static final int PERCENTILE = 95;
    private static final int PERCENT = 100;

    public static void main(String[] args) {
        Random random = new Random();

        int node1, node2;

        int countParallel = 0;
        int countSequential = 0;

        for (int i = 0; i < NUM_ATTEMPTS; i++) {
            node1 = random.nextInt(PERCENT);
            node2 = random.nextInt(PERCENT);

            // Parallel
            if (!(node1 >= PERCENTILE && node2 >= PERCENTILE)) {
                countParallel++;
            }

            // Sequential
            if (!(node1 >= PERCENTILE || node2 >= PERCENTILE)) {
                countSequential++;
            }
        }

        System.out.println("Percentile " + (double) PERCENTILE/PERCENT);
        System.out.println("Parallel " + (double) countParallel/NUM_ATTEMPTS);
        System.out.println("Sequential " + (double) countSequential/NUM_ATTEMPTS);
        System.out.println("Num attempts " + NUM_ATTEMPTS);
    }

    // TODO extend to many nodes with different levels
}
