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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int first=0, last=0;
        ListNode prev=head,curr=head.next,nxt=head.next.next;   
        int min=Integer.MAX_VALUE;
        int i=1;
        while(nxt!=null){
            if((curr.val > prev.val && curr.val > nxt.val) || (curr.val < prev.val && curr.val < nxt.val)){
                if(first==0) first=i;
                else min=Math.min(min,i-last);
                last=i;
            }
            prev=curr; curr=nxt;
            nxt=nxt.next;
            i++;
            
        }
        if(first == last){
            return new int[]{-1,-1};
        }
        return new int[]{min,last-first};
    }
}