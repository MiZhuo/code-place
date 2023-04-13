package site.mizhuo.code;


/**
 * Create by wulibin on 2019/8/1
 */
public class ReverseList {
    /**
     * 方法一：迭代
     * 假设存在链表 1 → 2 → 3 → Ø，我们想要把它改成 Ø ← 1 ← 2 ← 3。
     *
     * 在遍历列表时，将当前节点的 next 指针改为指向前一个元素。由于节点没有引用其上一个节点，因此必须事先存储其前一个元素。在更改引用之前，还需要另一个指针来存储下一个节点。不要忘记在最后返回新的头引用！
     *
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/two-sum/solution/fan-zhuan-lian-biao-by-leetcode/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    /**
     * 方法二：递归
     * 递归版本稍微复杂一些，其关键在于反向工作。假设列表的其余部分已经被反转，现在我该如何反转它前面的部分？
     *
     * 假设列表为：
     *
     * n_{1}\rightarrow ... \rightarrow n_{k-1} \rightarrow n_{k} \rightarrow n_{k+1} \rightarrow ... \rightarrow n_{m} \rightarrow \varnothing
     * n
     * 1
     * ​
     *  →...→n
     * k−1
     * ​
     *  →n
     * k
     * ​
     *  →n
     * k+1
     * ​
     *  →...→n
     * m
     * ​
     *  →∅
     *
     * 若从节点 n_{k+1}n
     * k+1
     * ​
     *   到 n_{m}n
     * m
     * ​
     *   已经被反转，而我们正处于 n_{k}n
     * k
     * ​
     *  。
     *
     * n_{1}\rightarrow ... \rightarrow n_{k-1} \rightarrow n_{k} \rightarrow n_{k+1} \leftarrow ... \leftarrow n_{m}
     * n
     * 1
     * ​
     *  →...→n
     * k−1
     * ​
     *  →n
     * k
     * ​
     *  →n
     * k+1
     * ​
     *  ←...←n
     * m
     * ​
     *
     *
     * 我们希望 n_{k+1}n
     * k+1
     * ​
     *   的下一个节点指向 n_{k}n
     * k
     * ​
     *  。
     *
     * 所以，n_{k}n
     * k
     * ​
     *  .next.next = n_{k}n
     * k
     * ​
     *  。
     *
     * 要小心的是 n_{1}n
     * 1
     * ​
     *   的下一个必须指向 Ø 。如果你忽略了这一点，你的链表中可能会产生循环。如果使用大小为 2 的链表测试代码，则可能会捕获此错误
     *
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/two-sum/solution/fan-zhuan-lian-biao-by-leetcode/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
