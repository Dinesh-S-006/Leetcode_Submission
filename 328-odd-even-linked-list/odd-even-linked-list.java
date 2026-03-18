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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)return head;

        ListNode oddH = head;
        ListNode evenH = head.next;

        ListNode oddTrav=oddH;
        ListNode evenTrav = evenH;
        while(evenTrav!=null && evenTrav.next!=null){
            oddTrav.next = evenTrav.next;
            oddTrav = oddTrav.next;
            evenTrav.next = oddTrav.next;
            evenTrav = evenTrav.next;
        }
        oddTrav.next=evenH;
        return head;
    }
}