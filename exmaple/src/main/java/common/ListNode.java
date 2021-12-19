package common;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; } 
    public static ListNode createList(int [] nums) {
        ListNode c = new ListNode(nums[0]);
        ListNode head = c;
        for (int i = 1; i < nums.length; i ++) {
            c.next = new ListNode(nums[i]);
            c = c.next;
        }
        return head;   
    }   
}
