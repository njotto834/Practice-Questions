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
        int overflow = 0; //Stores the "carry" value from summation.
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;
        
        int sum = head1.val + head2.val;
        if (sum >= 10){
            overflow = 1;
            current.next = new ListNode(sum % 10);
            current = current.next;
            sum = sum - 10;
        }
        else {
            overflow = 0;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        
        while ((head1.next != null) || (head2.next != null)){
            if (head1.next != null){
                head1 = head1.next;
            }
            else{
                //If head1.next is null, but head2.next isn't null, sets head1.val to 0 as to not affect summation.
                head1.val = 0;
            }
            
            if (head2.next != null){
                head2 = head2.next;
            }
            else{
                //If head2.next is null, but head1.next isn't null, sets head2.val to 0 as to not affect summation.
                head2.val = 0;
            }
            
            sum = head1.val + head2.val + overflow;
            
            if (sum >= 10){
                overflow = 1;
                current.next = new ListNode(sum % 10);
                current = current.next;
                sum = sum - 10;
            }
            else {
                overflow = 0;
                current.next = new ListNode(sum % 10);
                current = current.next;
            }
        }
        
        //If the sum of the last nodes in the linked lists resulted in overflow, a node is added to store the overflow.
        if (overflow > 0){
            current.next = new ListNode(overflow);
        }
        
        //dummyHead.next is the head of the return linked list.
        return dummyHead.next;
    }
}