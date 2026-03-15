package Interview.LinkList;

public class ReverseLinklist {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode reverseList(ListNode head) {

		ListNode prev = null;
		ListNode curr = head;

		while (curr != null) {

			ListNode next = curr.next;
			curr.next = prev;

			prev = curr;
			curr = next;
		}
		return prev;
	}

	public static void printList(ListNode head) { // list print function
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		System.out.println("Original List:");
		printList(head);

		ReverseLinklist obj = new ReverseLinklist();

		head = obj.reverseList(head); // reverse

		System.out.println("Reversed List:");
		printList(head);
	}

}
