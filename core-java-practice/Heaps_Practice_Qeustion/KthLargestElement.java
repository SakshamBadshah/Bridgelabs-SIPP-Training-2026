import java.util.PriorityQueue;

public class KthLargestElement {

    static int findKthLargest(int[] arr, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {

            if (minHeap.size() < k) {
                minHeap.offer(num);
            } else if (num > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(num);
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {

        int[] arr = {12, 5, 787, 1, 23, 45, 100, 65};

        int k = 3;

        System.out.println("Kth Largest = " + findKthLargest(arr, k));
    }
}