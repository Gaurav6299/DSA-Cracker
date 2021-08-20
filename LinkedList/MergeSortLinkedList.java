// Sort the LinkedList Using MergeSort..
public class MergeSortLinkedList {
    static Node head;
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

    Node mergeSort(Node head)
    {
        if(head==null ||  head.next==null)
        {
            return head;
        }
          Node mid=findMiddle(head);
          Node nextOfMid=mid.next;
          mid.next=null;
          Node left=mergeSort(head);

          Node right=mergeSort(nextOfMid);

          Node ans=mergeSorted(left,right);
          return ans;

    }

    Node mergeSorted(Node left,Node right)
    {
        Node temp=left;
        Node temp2=right;
        Node prev=null;
        if(temp.data<temp2.data){
            prev=temp;
            temp=temp.next;
        }else{
            prev=temp2;
            temp2=temp2.next;
        }
        Node head3=prev;
        
        while(temp!=null && temp2!=null)
        {
            if(temp.data<temp2.data)
            {
                prev.next=temp;
                temp=temp.next;
                prev=prev.next;
            }
            else
            {
                prev.next=temp2;
                temp2=temp2.next;
                prev=prev.next;
            }
        }
        
        while(temp!=null)
        {
            prev.next=temp;
            temp=temp.next;
            prev=prev.next;
            
        }
        
        while(temp2!=null)
        {
            prev.next=temp2;
            temp2=temp2.next;
            prev=prev.next;
            
        }
        return head3;
    }

    Node findMiddle(Node head)
    {
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        MergeSortLinkedList l=new MergeSortLinkedList();
        l.push(3);
        l.push(4);
        l.push(5);
        l.push(2);
        l.push(1);

        l.print();
       Node res= l.mergeSort(head);
       Node temp=res;
       while(temp!=null)
       {
           System.out.print(temp.data+"->");
           temp=temp.next;
       }
       System.out.println("null");
      
    
    }
    
}
