// Given a linked list of N nodes.And you are also given x position of the looping nodes. The task is to check if the linked list has a loop. Linked list can contain self loop.
// Or Check LinkedList Contains a Cycle or not.

// Note:- If the last Nodes is connected with xth nodes then we can say that LinkedList contains a loop or cycle.
public class LinkedListLoop {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    void push(int data)
    {
        Node x=new Node(data);
        if(head==null)
        {
            head=x;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=x;
        }
    }
    void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    boolean checkLoop()
    {
        if(head==null || head.next==null)
        return false;

        Node A=head;
        Node B=head.next;
        while(A!=B)
        {
            if(B==null || B.next==null)
            return false;

            A=A.next;
            B=B.next.next;
        }
        return true;
    }
    public static void main(String[] args) {
        int n=3;
        int x=2;
       LinkedListLoop l=new LinkedListLoop();
       l.push(1);
       l.push(3);
       l.push(4);
       l.print();
       System.out.println(l.checkLoop());
    }
    
}
