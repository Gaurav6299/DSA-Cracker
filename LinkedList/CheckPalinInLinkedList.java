class CheckPalinInLinkedList
{
    static Node head;
    class Node
    {
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

    boolean checkPalin(Node head)
    {
       Node temp=head;
       Node head2=new Node(-1);
       Node temp2=head2;
       while(temp!=null)
       {
           temp2.next=temp;
           temp=temp.next;
           temp2=temp2.next;
       }
      
       temp2=head2;
       Node next=null;
       Node prev=null;
       while(temp2!=null)
       {
           next=temp2.next;
           temp2.next=prev;
           prev=temp2;
           temp2=next;
       }
       Node temp3=prev;
       temp=head;
       while(temp!=null && temp3!=null)
       {
           if(temp.data!=temp3.data)
           return false;

           temp=temp.next;
           temp3=temp3.next;
       }

       return true;
    }
    public static void main(String[] args) {
        CheckPalinInLinkedList l=new CheckPalinInLinkedList();
        l.push(1);
        l.push(2);
        l.push(1);
        l.print();
        System.out.println(l.checkPalin(head));

    }
}