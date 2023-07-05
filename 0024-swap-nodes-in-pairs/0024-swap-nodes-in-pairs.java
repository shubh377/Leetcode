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
    public ListNode swapPairs(ListNode head) {
        
        if (head==null || head.next==null){
            return head;
        }
        ListNode temp=new ListNode(0);
        temp.next=head;
        
        ListNode curr=temp;
        while (curr.next!=null && curr.next.next!=null){
            
            ListNode first=curr.next;
            ListNode second=curr.next.next;
            
            first.next=second.next;
            curr.next=second;
            second.next=first;
            curr=curr.next.next;
        }
        return temp.next;
        
    }
}