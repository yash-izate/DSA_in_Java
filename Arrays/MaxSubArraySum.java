package Arrays;

// Prefix sum Array Approch - T.Complexity = O(n^2)

public class MaxSubArraySum {

    public static void maxSubArraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // calculate prefix array
        for (int i = 1; i < numbers.length; i++) {

            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                // Update max and min sum
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, -3, 4, 5, 6, 7, 8, -9, 10 };

        maxSubArraySum(numbers);
    }
}
