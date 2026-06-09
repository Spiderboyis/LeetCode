package LinkedList;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;
    ListNode(){

    }
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }

    public ListNode middleNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head){
        if(head == null){
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;
        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode tempHead = new ListNode();
        ListNode tempTail = tempHead;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tempTail.next = list1;
                list1 = list1.next;
                tempTail = tempTail.next;
            }else{
                tempTail.next = list2;
                list2 = list2.next;
                tempTail = tempTail.next;
            }
        }
        tempTail.next = (list1 != null) ? list1 : list2;
        return tempHead.next;
    }
    public ListNode deleteDuplicates(ListNode head){
        if(head == null){
            return head;
        }
        ListNode node = head;
        while(head.next != null){
            if(head.val == head.next.val){
                head.next = head.next.next;
            }else{
                head = head.next;
            }
        }
        return node;
    }
    public boolean hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    public ListNode removeElements(ListNode head, int val){
        ListNode ans = new ListNode(0,head);
        ListNode temp = ans;
        while(temp != null){
            if(temp.next != null && temp.next.val == val){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return ans.next;
    }
}
