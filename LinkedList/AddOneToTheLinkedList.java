class AddOneToTheLinkedList {
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
        head=x;

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


    Node reverse(Node head)
    {
        Node temp=head;
        Node prev=null;
        Node next=null;
        while(temp!=null)
        {
                next=temp.next;
                temp.next=prev;
                prev=temp;
                temp=next;
        }
        return prev;
    }
    
    Node addOne(Node head)
    {
    Node temp=head;
    Node prev=null;
    int carry=1;
    int sum=0;
    while(temp!=null)
    {
      sum=temp.data+carry;
      if(sum>=10)
      {
          carry=1;
      }else
      {
          carry=0;
      }
      sum=sum%10;

      temp.data=sum;
      prev=temp;
      temp=temp.next;
    }
    if(carry>0)
    {
    prev.next=new Node(carry);

    }
    return head;

    }
    public static void main(String[] args) {
        AddOneToTheLinkedList l=new AddOneToTheLinkedList();
        l.push(1);
        l.push(2);
        l.push(3);
        l.push(4);
        l.print();
        Node k=l.reverse(head);
        Node y=l.addOne(k);
        Node res=l.reverse(y);
        l.print();
    }
}
