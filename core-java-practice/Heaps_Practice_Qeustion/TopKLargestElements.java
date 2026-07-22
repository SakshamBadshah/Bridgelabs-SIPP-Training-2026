import java.util.*;

public class TopKLargestElements {

    static List<Integer> topK(int[] arr, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {

            if (minHeap.size() < k) {
                minHeap.offer(num);
            } else if (num > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(num);
            }
        }

        return new ArrayList<>(minHeap);
    }

    public static void main(String[] args) {

        int[] arr = {12, 5, 787, 1, 23, 45, 100, 65};

        int k = 3;

        System.out.println(topK(arr, k));
    }
}