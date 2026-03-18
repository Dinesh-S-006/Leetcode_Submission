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
    public ListNode removeElements(ListNode head, int val) {
    ListNode temp=head;
    ListNode dummy=new ListNode(0);
    ListNode result=dummy;
    while(temp!=null){
        if(temp.val!=val){
            dummy.next=new ListNode(temp.val);
            dummy=dummy.next;

        }
        temp=temp.next;
    }
    return result.next;}}


    


















//         ListNode dummy=new ListNode(0);
//         dummy.next=head;
//         ListNode curr=dummy;
//         while(curr.next!=null){
//             if(curr.next.val==val){
//                 curr.next=curr.next.next;
//         }
//         else{
//             curr=curr.next;
//         }
        

//         }
//         return dummy.next;
//     }
// }