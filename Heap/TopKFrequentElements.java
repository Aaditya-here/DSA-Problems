package Interview.Heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {

	public int[] topKFrequent(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

		pq.addAll(map.keySet());

		int[] result = new int[k];

		for (int i = 0; i < k; i++) {
			result[i] = pq.poll();
		}

		return result;
	}

	public static void main(String[] args) {

		int num[] = { 1, 1, 1, 2, 2, 3 };
		int k = 2;

		TopKFrequentElements elements = new TopKFrequentElements();
		int[] result = elements.topKFrequent(num, k);
		System.out.println(Arrays.toString(result));
	}

}
