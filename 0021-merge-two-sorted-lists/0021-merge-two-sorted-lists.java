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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode head = new ListNode();
        ListNode res = head;

        while(list1 != null || list2 != null){
            if (((list1 != null) ? list1.val : 101) < ( (list2 != null) ? list2.val : 101) ){
                head.next = list1;
                head = head.next;
                list1 = list1.next;
            } else{
                head.next = list2;
                head = head.next;
                list2 = list2.next;
            }

        }

        return res.next;
    }
}