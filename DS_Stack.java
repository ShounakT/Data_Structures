package data_Structures;

import java.util.Scanner;

public class DS_Stack {
	
	private static int top = -1;
	private static int[] arr;
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the size of the stack: ");
		int size = sc.nextInt();
		arr = new int[size]; 
		boolean loop = true;
		while(loop) {
			System.out.println("Enter the operation to perform: A:Push B:Pop C:isFull D:isEmpty E:Peek F.End");
			char op = sc.next().charAt(0);
			switch(op) {
			case 'A':
				Push();
				break;
			case 'B':
				Pop();
				break;
			case 'C':
				isFull();
				break;
			case 'D':
				isEmpty();
				break;
			case 'E':
				Peek();
				break;
			case 'F':
				System.out.println("Thank you!");
				loop = false;
				break;
			} 
		}
	}
	
	private static boolean isEmpty() {
		if(top == -1) {
			System.out.println("The stack is empty!");
			return true;
		}else {
			System.out.println("The stack contains "+ arr.length +" elements.");
			return false;
		}
	}
	
	private static boolean isFull() {
		if(top == arr.length-1) {
			System.out.println("The stack is full!");
			return true;
		}else {
			System.out.println("The stack is not full.");
			return false;
		}
	}
	
	private static void Push() {
		boolean check = true;
		int push = 0;
		if(isFull() == check) {
			System.out.println("Sorry, the stack is full.Push operation cannot be performed!");
		}else {
			
			System.out.println("Enter the number to be pushed:");
			push = sc.nextInt();
			arr[++top] = push;
			System.out.println("Push operation successful!");
		}
	}
	
	private static void Pop() {
		boolean check = true;
		int pop = 0;
		if(isEmpty() == check) {
			System.out.println("Sorry, the stack is empty.Pop operation cannot be performed!");
		}else {
			pop = arr[top--];
			System.out.println("The element at top is: " + pop);
			
		}
	}

	private static void Peek() {
		boolean check = true;
		int peek = 0;
		if(isEmpty() == check) {
			System.out.println("Sorry, the stack is empty.There is nothing to peek!");
		}else {
			peek = arr[top];
			System.out.println("The element at the top of the stack is: " + peek);
		}
	}
}
