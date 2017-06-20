
/**
 * The Class RevStrStackLinkList.
 */
public class RevStrStackLinkList {

	/** The head. */
	Node head;
	
	/**
	 * The Class Node.
	 */
	public static class Node {
		
		/** The value. */
		private char value;
		
		/** The next. */
		private Node next;
		
		/**
		 * Instantiates a new node.
		 *
		 * @param value the value
		 */
		public Node(char value) {
			this.value = value;
			this.next = null;
		}
	}
	
	/**
	 * Insert node.
	 *
	 * @param value the value
	 * @param head the head
	 * @return the node
	 */
	public Node push(char value, Node head) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
			return head;
		}
		
		newNode.next = head;
		head = newNode;
		return head;
	}
	
	/**
	 * Removes the node.
	 *
	 * @return the node
	 */
	public Node pop() {
		if(head == null) {
			System.out.println("Stack is empty");
			return null;
		}
		Node tempNode = head;
		head = head.next;
		return tempNode;
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		String testStr = "hundred";
		int strLen = testStr.length();
		RevStrStackLinkList  stackObj = new RevStrStackLinkList();
		stackObj.head = new Node(testStr.charAt(0));
		for(int i=1;i<strLen;i++) {
			char temp = testStr.charAt(i);
			stackObj.head = stackObj.push(temp, stackObj.head);
		}
		
		StringBuilder invertedBuilder = new StringBuilder();
		for(int i=0;i<strLen;i++) {
			invertedBuilder.append(stackObj.pop().value);
		}

		System.out.println(invertedBuilder.toString());
	}

}
