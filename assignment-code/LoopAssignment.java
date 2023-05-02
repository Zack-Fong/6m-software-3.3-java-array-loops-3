import java.util.ArrayList;

public class LoopAssignment {
    public static void main(String args[]) {
        // Task 1. Create a while loop that prints all the odd numbers from 1 to 50

        // Add code here
        int i = 1;
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        while (i < 51) {
            if (i % 2 != 0) {
                oddNumbers.add(i);
            }
            i++;
        }
        System.out.println("Odd numbers from 1 to 50 " + oddNumbers);

        /*
         * Task 2. Create a do-while loop that prints the following pattern from 1 to
         * 30:
         * If the number is divisible by 3, print "Fizz"
         * If the number is divisible by 5, print "Buzz"
         * If the number is divisible by 3 AND 5, print "FizzBuzz"
         * If the number is not divisible by 3 nor 5, print "Pop"
         */

        // Add code here
        int j = 1;
        do {
            // code block to be executed
            if (isDivisibleByThree(j) && isDivisibleByFive(j)) {
                System.out.println("FizzBuzz");
            } else if (isDivisibleByThree(j)) {
                System.out.println("Fizz");
            } else if (isDivisibleByFive(j)) {
                System.out.println("Buzz");
            } else {
                System.out.println("Pop");
            }

            j++;
        } while (j < 31);

        // Task 3. Use an enhanced for-loop to compute for the average of the given
        // array
        int expenses[] = { 120, 130, 114, 112, 132, 154, 123, 112, 165, 144, 188, 200 };
        float average = 0.0f;
        // Add code here
        int total = 0;
        for (int expense : expenses) {
            total += expense;
        }

        average = (float) total / expenses.length;
        System.out.println("Average: " + average);
    }

    static boolean isDivisibleByThree(int number) {
        // code to be executed
        if (number % 3 == 0) {
            return true;
        }
        return false;
    };

    static boolean isDivisibleByFive(int number) {
        // code to be executed
        if (number % 3 == 0) {
            return true;
        }
        return false;
    };
}
