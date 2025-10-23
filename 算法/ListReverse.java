package learn;

public class ListReverse {
    //单链表节点
    public static class ListNode {
        int val;
        ListNode next;
        public ListNode(int x) { val = x; }
        public ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }
    //单链表反转
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head!=null){
            next=head.next;//暂存head的下一个节点
            head.next=pre;//反转
            pre=head;
            head=next;
        }
        return pre;//返回反转后的头结点
    }
    //双链表节点
    public static class DoubleListNode {
        int val;
        public DoubleListNode last;
        public DoubleListNode next;
        public DoubleListNode(int x) {
            val = x;
        }
    }
    //双链表反转
    public static DoubleListNode reverseList(DoubleListNode head) {
        DoubleListNode pre = null;
        DoubleListNode next = null;
        while (head!=null){
            next=head.next;
            head.next=pre;
            head.last=next;
            pre=head;
            head=next;
        }
        return pre;
    }
}
