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

        if(head == null || head.next == null){
            return head;
        }
        
        ListNode curr = head;
        ListNode nextPair = head.next.next;
        ListNode foward = head.next;
        foward.next = curr;
        head.next = swapPairs(nextPair);
        
    

        return foward;
    }
}