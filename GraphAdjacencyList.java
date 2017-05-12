import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class GraphAdjacencyList {

	public Map<Integer,GraphAdjacencyList.LinkList> graphMap = new HashMap<Integer, GraphAdjacencyList.LinkList>();
	
	static class LinkList {
		Node head;
		
		public void addNode(int value, int weight) {
			if(head == null) {
				head = new Node(value, weight);
			} else {
				Node newNode = new Node(value, weight);
				newNode.next = head.next;
				head.next = newNode;
			}
		}
	}
	
	static class Node {
		private int endValue;
		private int weight;
		private Node next;
		
		public Node(int value, int weight) {
			this.endValue = value;
			this.weight = weight;
			next = null;
		}
	}
	
	public void put(int start, int end, int weight) {
		Node newNode = new Node(end, weight);
		LinkList linkList;
		if(graphMap.containsKey(start)) {
			linkList = graphMap.get(start);
			linkList.addNode(end, weight);
		}else {
			linkList = new LinkList();
			linkList.head = newNode;
			graphMap.put(start, linkList);
		}
		
	}
	
	public void printGraph() {
		Set<Integer> keySet = graphMap.keySet();
		for(Integer keyValue : keySet) {
			LinkList linkList = graphMap.get(keyValue);
			System.out.println();
			System.out.print(keyValue);
			System.out.print("-->"+linkList.head.endValue);
			Node lastNode = linkList.head;
			while(lastNode.next != null) {
				lastNode  = lastNode.next;
				System.out.print(","+lastNode.endValue);
			}
		}
	}
	
	public static void main(String[] args) {
		GraphAdjacencyList graph = new GraphAdjacencyList();
		graph.put(0,1,5);
		graph.put(1, 2, 4);
		graph.put(0,2,6);
		graph.put(0,5,5);
		graph.put(1,4, 4);
		graph.put(2,3,6);
		graph.put(1,5, 4);
		graph.put(2,4,6);
		graph.printGraph();
	}

}
