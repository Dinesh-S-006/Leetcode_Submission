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

 /*
length
step
nodes



 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        //
        if(head==null || head.next==null || k==0){
            return head;
        }
        // length
    int length=1;
    ListNode temp=head;
    while(temp.next!=null){
        length++;
        temp=temp.next;
    }
    temp.next=head;
    ListNode newnode_1=head;

    int number_of_Step=length-(k%length);
    for(int i=1;i<number_of_Step;i++){
          newnode_1=newnode_1.next;
    }
    ListNode newnode_2=newnode_1.next;
    newnode_1.next=null;
    return newnode_2;}}





























//         if(head==null || head.next==null || k==0){
//             return head;
//         }
//         // if(head.next==null){
//         //     return head;
//         // }
//         int length=1;
//         ListNode temp=head;
//         while(temp.next!=null){
//             temp=temp.next;
//             length++;
//         }
//  temp.next=head;
//         ListNode newTail=head;
//         int numberofStep=length-(k%length);
//         for(int i=0;i<numberofStep;i++){
//             newTail=newTail.next;
//         }

//         // while(numberofStep>1){
//         //     newTail=newTail.next;
//         //     numberofStep--;
//         // }
//         ListNode newHead=newTail.next;
//         newTail.next=null;
//          return newHead;
//     }
// }