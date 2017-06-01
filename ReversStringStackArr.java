
public class ReversStringStackArr {

	private int top,max;
	private char[] stack;
	
	public ReversStringStackArr(int size) {
		stack = new char[size];
		this.top = -1;
		max = size;
	}
	
	private void push(char temp) {
		if(top == max) {
			System.out.println("Stack is full");
			return;
		}
		stack[++top] = temp;
	}
	
	private char pop() {
		if(top==-1) {
			System.out.println("stack is empty");
			return '\u0000';
		}
		return stack[top--];
	}
	
	public static void main(String[] args) {
		String str = "hundred";
		int len = str.length();
		ReversStringStackArr stackRev = new ReversStringStackArr(len);
		for(int i=0;i<len;i++) {
			char temp = str.charAt(i);
			stackRev.push(temp);
		}
		
		StringBuilder revBuilder = new StringBuilder();
		for(int j=len-1;j>=0;j--) {
			revBuilder.append(stackRev.pop());
		}
		System.out.println(revBuilder.toString());
	}

}
