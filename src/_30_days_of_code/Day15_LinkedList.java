package _30_days_of_code;

import java.util.Scanner;

public class Day15_LinkedList {

	private static Scanner sc = new Scanner(System.in);
	public static Node insert(Node head, int data) {
		if (head == null) {
			return new Node(data);
		} else {
			Node tail = head;
			while (tail.next != null) {
				tail = tail.next;
			}
			tail.next = new Node(data);
			return head;
		}
	}
	public static void display(Node head) {
		Node start = head;
		while(start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Node head = null;
		int N = sc.nextInt();

		while(N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head,ele);
		}
		display(head);
		sc.close();
	}
}

class Node {
	int data;
	Node next;
	Node(int d) {
		data = d;
		next = null;
	}
}
