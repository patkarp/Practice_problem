import java.io.*;
import java.lang.*;
import java.util.*;
class LinkedList
{
	Node head; //head of the list
	//LinkedList Node. This is made static so that the innner class can access it.
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}	
	}
	public void printList()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data+" ");
		}
	}
	public static void main(String[] args)
	{
		LinkedList llist=new LinkedList();
		llist.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		llist.head.next=second;//Link first node with second node  
		second.next=third;//link second with third
		llist.printList()
;	}
}