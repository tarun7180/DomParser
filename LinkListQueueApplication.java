package test;

/**
 * The Class LinkListQueueApplication.
 */
public class LinkListQueueApplication {

	/**
	 * The Class Node.
	 */
	static class Node {
		
		/** The data. */
		int data;
		
		/** The next. */
		Node next;

		/**
		 * Instantiates a new node.
		 *
		 * @param data the data
		 */
		public Node(int data) {
			this.data = data;
		}
	}

	/** The start. */
	Node start;
	
	/** The end. */
	Node end;
	
	/** The min. */
	int max, min;

	/**
	 * Instantiates a new link list queue application.
	 */
	public LinkListQueueApplication() {
		this.start = null;
		this.end = null;
		this.max = -1;
		this.min = -1;
	}

	/**
	 * Adds the node.
	 *
	 * @param data the data
	 * @param list the list
	 */
	private static void addNode(int data, LinkListQueueApplication list) {
		Node newNode = new Node(data);

		if (list.start == null && list.end == null) {
			list.start = newNode;
			list.end = newNode;
			return;
		}
		list.end.next = newNode;
		list.end = newNode;
	}

	/**
	 * Removes the node.
	 *
	 * @param list the list
	 * @return the node
	 */
	private static Node removeNode(LinkListQueueApplication list) {
		if (list.start == null) {
			System.out.println("Queue is empty");
			return null;
		} else if (list.start == list.end) {
			Node tempNode = list.start;
			list.start = null;
			list.end = null;
			return tempNode;
		} else {
			Node tempNode = list.start;
			list.start = list.start.next;
			return tempNode;
		}
	}

	/**
	 * Calculate min max.
	 *
	 * @param num the num
	 * @param list the list
	 */
	private static void calculateMinMax(int num, LinkListQueueApplication list) {
		if (list.max < num) {
			list.max = num;
		}
		if (list.min > num || list.min == -1) {
			list.min = num;
		}
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int[] inputArr = { 1, 6, 2, 9, 3, 7, 4 };
		LinkListQueueApplication listObj = new LinkListQueueApplication();
		for (int count = 0; count < inputArr.length; count++) {
			addNode(inputArr[count], listObj);
			calculateMinMax(inputArr[count], listObj);
			System.out.println("Current min>>" + listObj.min
					+ ">>current max>>" + listObj.max);
		}

		for (int count = 0; count < inputArr.length; count++) {
			System.out.println("Get number>>" + removeNode(listObj).data);
			calculateMinMax(inputArr[count], listObj);
			System.out.println("Current min>>" + listObj.min
					+ ">>current max>>" + listObj.max);
		}
	}
}
