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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int [] arr=new int[count];
        
        for (int i=0;i<count;i++){
            arr[i]=temp.val;
            temp=temp.next;
        }
        
        int i=left-1;
        int j=right-1;
        
        while (i<j){
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++;
            j--;
        }
        
        ListNode ans=new ListNode(arr[0]);
        ListNode val=ans;
        for (int k=1;k<arr.length;k++){
            ans.next=new ListNode(arr[k]);
            ans=ans.next;
        }
        
        ans.next=null;
        
        return val;
    }
}