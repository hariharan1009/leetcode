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
    public int getDecimalValue(ListNode head) {
        ListNode p=head;
        int c=-1;
        while(p!=null){
            c++;
            p=p.next;
        }
        int sum=0;
        while(head!=null){
            sum+=head.val*(int)Math.pow(2,c--);
            head=head.next;
        }
        return sum;
    }
}