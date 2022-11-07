package Leetcode;

public class Reverse_Nodes_in_K_group {
    /*
    public ListNode reverseKGroup(ListNode head, int k) {
        
        //Approach1, using recursion , T.C : O(n)
        ListNode curr = head;
        int count = 0;
        
        while(curr!=null && count!=k){ //finding the (k+1)th node
            curr = curr.next;
            count++;
        }
        //if (k+1)th node is found
        if(count==k){
            //call recursion for reversing the list with k+1 node as head
            curr = reverseKGroup(curr, k);
            // head - head-pointer to direct part, 
            // curr - head-pointer to reversed part;
            while(count-->0){ //reverse current k group
                ListNode temp = head.next; // tmp - next head in direct part
                head.next = curr; //preappending "direct" head to the reversed list
                curr = head; // move head of reversed part to a new node
                head = temp; // move "direct" head to the next node in direct part
            }
            head=curr;
        }
        return head;
        
        //Approach2, T.C : O(n), S.C : O(n)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pointer = dummy;
        while (pointer != null) {
            ListNode node = pointer;
            // first check whether there are k nodes to reverse
            for (int i = 0; i < k && node != null; i++) {
                node = node.next;
            }
            if (node == null) break;
            
            // now we know that we have k nodes, we will start from the first node
            ListNode prev = null, curr = pointer.next, next = null;
            for (int i = 0; i < k; i++) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            ListNode tail = pointer.next;
            tail.next = curr;
            pointer.next = prev;
            pointer = tail;
        }
        return dummy.next;
    }
    */
}
