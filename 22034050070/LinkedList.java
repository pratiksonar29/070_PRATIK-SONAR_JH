import java.util.Scanner;
class LinkedList {
	static Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int element){
			
			data = element;
			next = null;
		}
	}
	
	public Node reverse(Node node){
		
		Node prev = null;
		Node curr = node;
		Node next = null;
		
		while(curr != null){
			
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		node = prev;
		return node;
	}
	
	public void showLL(Node node){
		
		while(node != null){
		System.out.print(node.data +" ");
		node = node.next;
		}
		
	}
	
	public static void main(String args[]){
		
		LinkedList l = new LinkedList();
		Scanner sc = new Scanner(System.in);
		
		
		//while((String i=sc.nextLine()) != null){
			// int x = 1;
			// int y = Integer.parsInt(i.charAt(x++));
			// l.head=new Node(i);
		// head = head.next;}
		
			
		
		l.head = new Node(1);
		l.head.next = new Node(2);
		l.head.next.next  = new Node(3);
		
		l.showLL(head);
		head = l.reverse(head);
		System.out.println();
		l.showLL(head);	
	}
}