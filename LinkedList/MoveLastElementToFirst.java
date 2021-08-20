// Move Last Element To the first in a LinkedList
class MoveLastElementToFirst
{
    Node head;
    class  Node{
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
        else
        {
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

    Node move()
    {
        Node temp=head;
        Node prev=head.next;
        while(prev.next!=null)
        {
            temp=temp.next;
            prev=prev.next;
        }
        prev.next=head;
        temp.next=null;
        head=prev;
        return head;
    }
  public static void main(String[] args) {
      MoveLastElementToFirst l=new MoveLastElementToFirst();
      l.push(1);
      l.push(2);
      l.push(3);
      l.push(4);
      l.push(5);
      l.print();
      System.out.println("Move Last Element to First...");
     
      Node k= l.move();
      l.print();
  }
}