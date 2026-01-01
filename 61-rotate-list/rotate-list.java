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
        if(head==null || head.next==null || k==0){
            return head;
        }
        // if(head.next==null){
        //     return head;
        // }
        int length=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
 temp.next=head;
        ListNode newTail=head;
        int numberofStep=length-(k%length);


        while(numberofStep>1){
            newTail=newTail.next;
            numberofStep--;
        }
        ListNode newHead=newTail.next;
        newTail.next=null;
         return newHead;
    }
}