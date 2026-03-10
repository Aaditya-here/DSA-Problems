package Interview;

import java.util.PriorityQueue;

public class FindMedianfromDataStream {

	PriorityQueue<Integer> maxHeap;
	PriorityQueue<Integer> minHeap;

	public FindMedianfromDataStream() {

		minHeap = new PriorityQueue<>();
		maxHeap = new PriorityQueue<>((a, b) -> (b - a));

	}

	public void addNum(int num) {

		maxHeap.add(num);

		minHeap.add(maxHeap.poll());

		if (minHeap.size() > maxHeap.size()) {
			maxHeap.add(minHeap.poll());
		}
	}

	public double findMedian() {

		if (minHeap.size() > maxHeap.size()) {
			return maxHeap.peek();

		}
		return (maxHeap.peek() + minHeap.peek()) / 2.0;
	}

	public static void main(String[] args) {
		// you can create a data stream here
		FindMedianfromDataStream dataStream = new FindMedianfromDataStream();
		dataStream.findMedian();
	}

}
