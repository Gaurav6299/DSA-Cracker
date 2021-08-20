public class RemoveDuplicateSortedLinkedList {
    Node head;
    class Node{
        Node next;
        int data;
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

    Node removeDuplicate()
    {
        Node temp=head;
        Node prev=head.next;
        while(temp!=null || prev!=null)
        {
            while(prev!=null && temp.data==prev.data)
            {
               temp.next=prev.next;
               prev=prev.next;
            }
            if(prev==null)
            return head;
            else{
                temp=temp.next;
                prev=prev.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        RemoveDuplicateSortedLinkedList l=new RemoveDuplicateSortedLinkedList();
        l.push(1);
        l.push(2);
        l.push(2);
        l.push(3);
        l.push(4);
        System.out.println("\nPrint LikedList with Duplicate");
        l.print();
        Node k=l.removeDuplicate();
        System.out.println("\nAfter Removing the Duplicate..");
        l.print();
    }
    
}
