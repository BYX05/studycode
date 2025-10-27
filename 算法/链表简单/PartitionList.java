package learn.studycode.算法.链表简单;

// 给你一个链表的头节点 head 和一个特定值 x
// 请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
// 你应当 保留 两个分区中每个节点的初始相对位置
// 测试链接 : https://leetcode.cn/problems/partition-list/
public class PartitionList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }
    public static ListNode partition(ListNode head,int x){
        ListNode leftHead=null,leftTail=null;// < x的区域
        ListNode rightHead=null,rightTail=null;// >= x的区域
        ListNode next=null;
        while (head!=null){
            next=head.next;
            head.next=null;
            if(head.val<x){
                if(leftHead==null){
                    leftHead=head;
                }else {
                    leftTail.next=head;
                }
                leftTail=head;
            }else {
                if(rightHead==null){
                    rightHead=head;
                }else {
                    rightTail.next=head;
                }
                rightTail=head;
            }
            head=next;
        }
        if(leftHead==null)
            return rightHead;
        // < x的区域有内容！
        leftTail.next=rightHead;
        return leftHead;
    }
}
