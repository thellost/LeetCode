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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1){
            return head;
        }
        return reverseNode(head,k);
    }


    public ListNode reverseNode(ListNode head, int k){
        ListNode curr = head, prev = null, next = null;
        if(traverse(head,k) || head == null){
            return head;
        }
        // Traverse all the nodes of Linked List
        for(int i = 0; i < k; i++){
            // Store next
            next = curr.next;

            // Reverse current node's next pointer
            curr.next = prev;

            // Move pointers one position ahead
            prev = curr;
            curr = next;

            
        }
        head.next = reverseNode(next,k);
        return prev;
    }

    public boolean traverse(ListNode head, int k){
        while(head != null && k > 0){
            head = head.next;
            
            if(head == null && k != 1){
                return true;
            }
            k--;
            
            
        }
        
        return false;
    }
}