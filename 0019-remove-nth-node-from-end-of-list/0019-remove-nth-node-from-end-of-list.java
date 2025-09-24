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
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = head.next;
        
        int length = 1;
        while(next != null){
            
            length += 1;
            next = next.next;
        }
        
        
        next = head.next;

        if((length-n)==0){
            return head.next;
        }
        for(int i = 0; i < length-1; i++){
            
            prev = curr;
            curr = next;
            next = curr.next;
            
            if(i == length-n-1){
                prev.next = next;
                break;
            }

            
            
        }
        System.out.println(length);
        return head;
    }
}