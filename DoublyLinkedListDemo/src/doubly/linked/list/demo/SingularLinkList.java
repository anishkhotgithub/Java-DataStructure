package doubly.linked.list.demo;

public class SingularLinkList 
{
	Node start;
	Node end;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	
	public void insertAtBeginning(int data)
	{
		Node node=new Node(data);
		
		if(start==null)
		{
			start=node;
			end=node;
			return;
		}
		
		node.next=start;
		start=node;
	}
	
	public void insertAtEnd(int data)
	{
		Node node=new Node(data);
		
		if(start==null)
		{
			start=node;
			end=node;
			return;
		}
		
		end.next=node;
		end=node;
	}
}
