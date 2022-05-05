import java.util.*;
class Stacks{
	int arr[];
	int size;
	int top1;
	int top2;
	
	Stacks(int n){
		size = n;
		arr = new int [n];
		top1 = n/2+1;
		top2 = n/2;
	}
	
	public void push1(int e){
		
		if(top1>0){
			
			top1--;
			arr[top1]=e;	
		}
		
		else
		{
			System.out.println("Stack is full");
			return;
		}
	}
	
	public void push2(int e){
		
		if(top2<size-1){
			
			top2++;
			arr[top2]=e;
		}
		
		else
		{
			System.out.println("Stack is full");
			return;
		}
		
	}
	
	public int pop1(){
		
		if(top1<=size/2){
			
			int x = arr[top1];
			top1++;
			return x;
		}
		
		else
		{
			System.out.println("Stack is Empty");
			System.exit(1);
		}
		return 0;
	}
	
	public int pop2(){
		
		if(top2>=size/2+1){
			
			int x = arr[top2];
			top2--;
			return x;
		}
		
		else
		{
			System.out.println("Stack is Empty");
			System.exit(1);
		}
		return 1;
	}
}

class App{
	
	public static void main(String args[]){
		
		Stacks s= new Stacks(10);
		s.push1(5); 
		s.push2(10); 
		s.push2(15); 
		s.push1(11); 
		s.push2(7); 
		s.push2(40);
		
		System.out.println("Popped element from stack1 is "+s.pop1());
		System.out.println("Popped element from stack2 is "+s.pop2());
	}
	
}