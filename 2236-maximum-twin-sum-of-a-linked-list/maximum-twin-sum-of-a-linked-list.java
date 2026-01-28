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
    public int pairSum(ListNode head) {
         ListNode slow=head;
         ListNode fast=head;
         while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
         }
        ListNode prev=null;
         ListNode curr=slow;
         while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
         }
         ListNode check1=prev;
         ListNode check2=head;
         int small=Integer.MIN_VALUE;
         while(check1!=null && check2!=null){
            small=Math.max(small,check1.val+check2.val);
            check1=check1.next;
            check2=check2.next;
         }
         return small;
         

    }
}