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
    public ListNode partition(ListNode head, int x) {
        ListNode beforedummy=new ListNode(0);
        ListNode afterdummy=new ListNode(0);
        ListNode before=beforedummy;
        ListNode after=afterdummy;

        ListNode temp=head;
   

        while(temp!=null){
            if(temp.val < x){
               before.next=temp;
                before=before.next;

            }
            else{
                after.next=temp;
                after=after.next;
            }
            temp=temp.next;
                   }
        after.next=null;
        before.next=afterdummy.next;

        return beforedummy.next;

       
        
    }
}