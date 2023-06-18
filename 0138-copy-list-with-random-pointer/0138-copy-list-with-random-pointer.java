/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        if (head==null){
            return head;
        }
        Node curr=head;
        while (curr!=null){
            Node temp=curr.next;
            curr.next=new Node(curr.val);
            curr.next.next=temp;
            curr=temp;
        }
        
        curr=head;
        
        while (curr!=null){
            if (curr.next!=null){
                curr.next.random= (curr.random!=null) ? curr.random.next : null;
            }
            curr=curr.next.next;
        }
        
        Node orig=head;
        Node copy=head.next;
        Node temp=copy;
        
        while (orig!=null){
            
            if (copy.next==null){
                orig.next=null;
                break;
            }
            
            else{
                orig.next=orig.next.next;
                copy.next=copy.next.next;
                orig=orig.next;
                copy=copy.next;
            }  
        }
        
        return temp;
    }
}