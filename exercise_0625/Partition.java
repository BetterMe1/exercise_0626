package exercise.exercise_0625;

/*
链表分割
编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。注意：分割以后保持原来的数据顺序不变。
 */

public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode cur = pHead;
        ListNode p1 = new ListNode(0);
        ListNode p2 = new ListNode(0);
        ListNode p1Head = p1;
        ListNode p2Head = p2;
        while(cur != null){
            if(cur.val < x){
                p1.next = new ListNode(cur.val);
                p1 = p1.next;
            }else{
                p2.next = new ListNode(cur.val);
                p2 = p2.next;
            }
            cur = cur.next;
        }
        if(p1Head.next == null){
            return p2Head.next;
        }
        p1.next = p2Head.next;
        return p1Head.next;
    }
}
