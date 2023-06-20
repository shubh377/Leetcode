/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        
        if (head==null || head.next==null){
            return head;
        }
        
        ListNode temp=head;
        int count=1;
        
        while (temp.next!=null){
            count++;
            temp=temp.next;
        }
        
        temp.next=head;
        int val=k%count;
        val=count-val;
        
        ListNode curr=head;
        
        while (val>1){
            curr=curr.next;
            val--;
        }
        ListNode ans=curr.next;
        head=ans;
        curr.next=null;
        
        return head;
    }
}