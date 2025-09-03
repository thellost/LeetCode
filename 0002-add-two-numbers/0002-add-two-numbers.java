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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = new ListNode(0);
        ListNode head = new ListNode();
        boolean save_head = true;
        int carry_over = 0;
        int val_l1 = 0 , val_l2 = 0;
        while(l1 != null || l2 != null){
            
            //make sure theres a number
            if(l1 != null){
                val_l1 = l1.val;
                l1 = l1.next;
            } else {
                val_l1 = 0;
            }
            if(l2 != null) {
                val_l2 = l2.val;
                l2 = l2.next;
            } else{
                val_l2 = 0;
            }

            //adding number
            current.val = val_l1 + val_l2 + current.val;

            //handle carry over
            if (current.val > 9){
                current.val = current.val % 10;
                //move pointer
                current.next = new ListNode(1);
            } else if (l1 != null || l2 != null) {
                current.next = new ListNode(0);
            }


            if(save_head){
                head = current;
                save_head = false;
            }

            //move pointer 
            current = current.next;

            
            
        }
        return head;
    }

}

