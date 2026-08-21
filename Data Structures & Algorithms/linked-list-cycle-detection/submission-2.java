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
    public boolean hasCycle(ListNode head) {

            Set<ListNode> nodeSet = new HashSet<>();

            ListNode current = head;

            while(current != null) {
                if (nodeSet.contains(current)) return true;
                nodeSet.add(current);
                current = current.next;

            }

            return false;
        
    }
}
