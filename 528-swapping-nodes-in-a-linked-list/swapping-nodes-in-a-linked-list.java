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
    public ListNode swapNodes(ListNode head, int k) {
       ListNode temp=head;
        int c=1;

        while(temp!=null){
            c++;
            temp=temp.next;
        }
      ListNode first=head;
      ListNode second=head;
      for(int i=1;i<k;i++){
        first=first.next;
      }
      for(int j=1;j<c-k;j++){
          second=second.next;
      }

      int t=first.val;
      first.val=second.val;
      second.val=t;

      return head;}}