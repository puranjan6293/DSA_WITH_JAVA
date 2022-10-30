package Leetcode;

public class Sort_LinkedList {
    /**
    public ListNode sortList(ListNode head) {
        /**
        //Approach1, Using stack
        //base case
        if(head==null) return null;
        
        Stack<Integer> s = new Stack<>();
        ListNode curr = head;
        while(curr!=null){
            s.push(curr.val);
            curr = curr.next;
        }
        Collections.sort(s);
        Collections.reverse(s);
        
        ListNode ans = new ListNode(-1);
        ListNode nHead = ans;
        while(!s.isEmpty()){
            ans.next = new ListNode(s.pop());
            ans = ans.next;
        }
       return nHead.next; 
       */
        
        /**
        //Approach2, Using ArrayList
        // TC: O(n) + O(n * logn) + O(n ^ 2)
        // SC: O(n)
        if (head == null) return null;

        List<Integer> list = new ArrayList<>();
        ListNode n = head;

        while (n != null) {
            list.add(n.val);
            n = n.next;
        }

        Collections.sort(list, Collections.reverseOrder());

        ListNode newNode = new ListNode(-1);
        ListNode newHead = newNode;

        while (!list.isEmpty()) {
            int idx = list.size() - 1;
            newNode.next = new ListNode(list.remove(idx));
            newNode = newNode.next;
        }

        return newHead.next;
        */
        
        /*
        //Approach3, using bottom up merge sorting, TC: O(n * logn), SC: O(1)
        if (head == null || head.next == null) return head;

        // find middle
        ListNode f = head, s = head;
        ListNode prev = null;

        while (f != null && f.next != null) {
            prev = s;
            s = s.next;
            f = f.next.next;
        }

        prev.next = null;

        ListNode leftHalf = sortList(head);
        ListNode rightHalf = sortList(s);

        return merge(leftHalf, rightHalf);
    }
    
	// 21. Merge Two Sorted Lists, 
    public ListNode merge(ListNode head1, ListNode head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        ListNode newNode = new ListNode();
        ListNode newHead = newNode;

        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                newNode.next = head1;
                head1 = head1.next;
            }
            else {
                newNode.next = head2;
                head2 = head2.next;
            }

            newNode = newNode.next;
        }

        while (head1 != null) {
            newNode.next = head1;
            head1 = head1.next;
            newNode = newNode.next;
        }

        while (head2 != null) {
            newNode.next = head2;
            head2 = head2.next;
            newNode = newNode.next;
        }

        return newHead.next;
    }
    */
}
