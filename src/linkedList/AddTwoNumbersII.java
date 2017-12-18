package linkedList;

import java.util.List;

/**
 * Created by cuixiaodao on 12/18/2017
 * for leetCode problem:
 * https://leetcode.com/problems/add-two-numbers-ii/description/
 */

public class AddTwoNumbersII{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1_r = reverseList(l1);
        ListNode l2_r = reverseList(l2);

        ListNode walk1 = l1_r, walk2 = l2_r, pre1 = walk1;
        int[] cin_s = new int[]{0, 0};

        while(walk1 != null && walk2 != null){
            cin_s = addDigit( walk1.val, walk2.val, cin_s[1]);
            walk1.val = cin_s[0];

            pre1 = walk1;
            walk1 = walk1.next;
            walk2 = walk2.next;
        }

        if(walk1 == null){
            pre1.next = walk2;
            walk1 = walk2;
        }

        while(cin_s[1] != 0){
            if(walk1 == null){
                pre1.next = new ListNode(1);
                break;
            }
            cin_s = addDigit( walk1.val, 0, 1);
            walk1.val = cin_s[0];
            pre1 = walk1;
            walk1 = walk1.next;
        }

        return reverseList(l1_r);
    }

    private ListNode reverseList(ListNode head) {
        ListNode reverseHead = null;
        while (head != null) {
            ListNode curNode = head;
            head = head.next;

            curNode.next = reverseHead;
            reverseHead = curNode;
        }

        return reverseHead;
    }

    private int[] addDigit(int n1, int n2, int cin){
        int[] cin_s = new int[2];
        cin_s[0] = n1 + n2 + cin;
        if(cin_s[0] > 9){
            cin_s[1] = 1;
            cin_s[0] -= 10;
        }
        else cin_s[1] = 0;  
        
        return cin_s;
    }
    
   public static void main(String[] args){
       AddTwoNumbersII t = new AddTwoNumbersII()       ;
       ListNode r1 = new ListNode(1);
       r1.next = new ListNode(2);
       r1.next.next = new ListNode(3);
       r1.next.next.next = new ListNode(4);

       ListNode r2 = new ListNode(9);
       r2.next = new ListNode(2);
    //    r1.next.next = new ListNode(3);
    //    r1.next.next.next = new ListNode(4);
       ListNode out = t.addTwoNumbers(r2, r1);
       System.out.print(out);
   }    
}