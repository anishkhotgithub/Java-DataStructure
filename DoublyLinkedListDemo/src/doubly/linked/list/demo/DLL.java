package doubly.linked.list.demo;

public class DLL
{ 
    Node head; 

    class Node 
    { 
        int data; 
        Node prev; 
        Node next; 
        Node(int d) { data = d; } 
    } 
  
    public void push(int new_data)
    { 
        Node new_Node = new Node(new_data); 
  
        new_Node.next = head; 
        new_Node.prev = null; 

        if (head != null)
            head.prev = new_Node; 
  
        head = new_Node; 
    } 
  
    public void InsertAfter(int prev_data, int new_data)//2,3
    { 
        Node node=head;
        Node prev_Node=null;
        while(node!=null)
        {
            if(node.data==prev_data)
            {
                prev_Node=node;
                break;
            }
            else
            {
                node=node.next;
            }
        }
        
        Node new_node = new Node(new_data); 
        if (prev_Node == null) { 
            System.out.println("The given previous node cannot be NULL "); 
            return; 
        } 
        new_node.next = prev_Node.next; 
        prev_Node.next = new_node; 
        new_node.prev = prev_Node; 
  
        if (new_node.next != null) 
            new_node.next.prev = new_node; 
    } 
  
    void append(int new_data)
    { 
        Node new_node = new Node(new_data); 
        Node last = head;  
        new_node.next = null; 
  
        if (head == null) { 
            new_node.prev = null; 
            head = new_node; 
            return; 
        } 
  
        while (last.next != null)
            last = last.next; 
  
        last.next = new_node; 
  
        new_node.prev = last; 
    } 
  
    public void printlist()
    { 
    	Node last=null;
        Node node=head;
        
        System.out.println("Traversal in forward Direction"); 
        while (node != null) 
        { 
            System.out.print(node.data + " "); 
            last = node; 
            node = node.next; 
        } 
        
        
        System.out.println(); 
        System.out.println("Traversal in reverse direction"); 
        while (last != null) { 
            System.out.print(last.data + " "); 
            last = last.prev; 
        } 
    } 
  
    public void run()
    {
        push(8);
        push(5);
        push(2);
        append(4);
        InsertAfter(2, 3);
  
        System.out.println("Created DLL is: "); 
        printlist(); 
    }
    
    public static void main(String[] args) 
    { 
        DLL dll=new DLL();
        dll.run();
    } 
} 
  