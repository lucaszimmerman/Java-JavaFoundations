package Aula08;

public class BoundaryTesting {

    public static void main(String args[]) {
        int CALENDAR_START = 1583;

        int[][] testCases = {
            {1582, 2},
            {1583, 0},
            {1583, 13},
            {1583, 1},
            {1583, 12}
        };

        for (int[] testCase : testCases) {
            int year = testCase[0];
            int month = testCase[1];

            // validate input
            if ((year < CALENDAR_START) || (month < 1) || (month > 12)) {
                System.out.println("Bad request: " + year + " " + month);
            } else {
                System.out.println("Valid request: " + year + " " + month);
            }
        }
    }
}

