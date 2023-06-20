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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if (head==null){
            return head;
        }
        
        ListNode temp=head;
        
        int count=0;
        
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        
        if (count==1 && n==1){
            return null;
        }
        
        int val=count-n;
        ListNode curr=head;
        
        if (val==0){
            return head.next;
        }
        while (val>1){
            curr=curr.next;
            val--;
        }
        
        ListNode ans=curr.next.next;
        curr.next=ans;
        
        return head;
    }
}