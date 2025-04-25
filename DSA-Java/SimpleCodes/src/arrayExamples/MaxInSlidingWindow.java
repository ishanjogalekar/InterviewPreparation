package arrayExamples;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaxInSlidingWindow {

    public int[] maxSlidingWindow(int[] prices, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] result = new int[prices.length - k + 1];

        for (int i = 0; i < prices.length; i++) {
            // Remove indices out of this window
            if (!dq.isEmpty() && dq.peek() < i - k + 1) {
                dq.poll();
            }

            // Remove all smaller elements (they’ll never be max)
            while (!dq.isEmpty() && prices[dq.peekLast()] < prices[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.offer(i);

            // Add to result from the k-th element onward
            if (i >= k - 1 && !dq.isEmpty()) {
                result[i - k + 1] = prices[dq.peek()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] prices = {3, 5, 2, 1, 7, 6, 4};
        int k = 3;
        MaxInSlidingWindow maxInSlidingWindow = new MaxInSlidingWindow();
        int[] result = maxInSlidingWindow.maxSlidingWindow(prices, k);
        System.out.println(Arrays.toString(result));
    }

}
