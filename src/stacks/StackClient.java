package stacks;

public class StackClient {

	public static void main(String[] args) throws StackFullException,StackEmptyException{
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.getSize());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.getSize());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.getSize());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.getSize());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.getSize());
	}
}
