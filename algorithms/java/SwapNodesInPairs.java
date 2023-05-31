//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return head;
        }
        
       ListNode newHead = new ListNode(0,head);
       ListNode temp = newHead;
       ListNode one = null;
       ListNode two = null;

       //(newHead -> 1 -> 2 -> 3 -> 4 -> null)
    
        while(temp.next !=null && temp.next.next != null){
            //temp points to newHead in the beginning.
            one = temp.next;    // one -> 1
            two = temp.next.next; // two -> 2

            one.next = two.next; // 1 -> 3
            two.next = one; // 2 -> 1

            // newHead should points to 2
            temp.next = two;
            temp = one; //temp -> 1

        }

        return newHead.next;
    }
}