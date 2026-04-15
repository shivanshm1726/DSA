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

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode dummy = new ListNode();
        ListNode current = dummy;

        ListNode node1 = list1;
        ListNode node2 = list2;

        while(node1 != null && node2 != null){
            if(node1.val < node2.val){
                current.next = node1;
                node1 = node1.next;
            }else{
                current.next = node2;
                node2 = node2.next;
            }
            current = current.next;
        }

        if(node1 != null){
            current.next = node1;
        }else{
            current.next = node2;
        }

        return dummy.next;
    }
}