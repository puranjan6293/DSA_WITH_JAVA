package Leetcode;

public class Reverse_LinkedList_Between {
    /*
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0); //create a dummy node 
        dummy.next = head;
        ListNode prev = dummy; //initialising prev pointer in dummy node 
        
        //traverse till left-1
        for(int i=0;i<left-1;i++){
            //adjusting the prev pointer on its actual index
            prev = prev.next;
        }
        //curr pointer will be just after prev pointer
        ListNode curr = prev.next;
        
        //reversing
        for(int i=0;i<right-left;i++){
            //temp pointer will be after the curr pointer
            ListNode temp = curr.next;
            //swap
            curr.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
            
        }
        return dummy.next;
    }
     */
}
