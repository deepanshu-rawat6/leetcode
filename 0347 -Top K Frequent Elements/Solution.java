// Solution 1: maxHeap

// Approach: 
/*
 * Using a HashMap to store the frequency of each element in the array.
 * Using a maxHeap to store the frequency of elements, in a decreasing order.
 * Adding all the elements of the map to the maxHeap.
 * Polling the top k elements from the maxHeap.
 * Returning the array of top k elements.
 */

class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);

        // maxHeap to store the frequency of elements, in a decreasing order
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>(
            // Using a custom comparator to sort the elements in the maxHeap
                (a,b) -> b.getValue() - a.getValue()
        );

        // Adding all the elements of the map to the maxHeap
        maxHeap.addAll(map.entrySet());

        int i = 0;
        while (i < k) {
            arr[i++] = Objects.requireNonNull(maxHeap.poll()).getKey();
        }

        return arr;
    }
}

// Time complexity: O(nlogk)
// Space complexity: O(n)

// Solution 2: minHeap

// Approach:
/*
 * Using a HashMap to store the frequency of each element in the array.
 * Using a minHeap to store the frequency of elements, in a increasing order.
 * Adding all the elements of the map to the minHeap, and checking if the size of the minHeap is greater than k, then poll the top element.
 * Returning the array of top k elements.
 */

class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
       int[] arr = new int[k];
       HashMap<Integer, Integer> map = new HashMap<>();
       for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);

    //    minHeap to store the frequency of elements, in a increasing order
       PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
               (a, b) ->
                       a.getValue() - b.getValue()
       );

    //    taking only the largest k elements, and polling the smaller elements
       for (Map.Entry<Integer, Integer> it : map.entrySet()) {
           pq.add(it);
           if (pq.size() > k) pq.poll();
       }
       int i = k;
       while (!pq.isEmpty()) {
           arr[--i] = pq.poll().getKey();
       }
       return arr;
   }
}

// Time complexity: O(nlogk)
// Space complexity: O(n)