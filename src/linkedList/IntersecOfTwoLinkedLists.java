package linkedList;

/**
 * Created by cuixiaodao on 12/16/2017
 * for leetCode problem:
 * https://leetcode.com/problems/intersection-of-two-linked-lists/description/
 */


public class IntersecOfTwoLinkedLists{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        
        int lenA = 0, lenB = 0;
        ListNode walkA = headA, walkB = headB;

        // get lenA,lenB and end nodes of A and B
        while(walkA.next != null){
            walkA = walkA.next;
            lenA++;
        }

        while(walkB.next != null){
            walkB = walkB.next;
            lenB++;
        }

        // if A,B don't share the same final node, no Inter
        if(walkA != walkB)
            return null;
        
        walkA = headA;
        walkB = headB;

        while(lenA > lenB){
            walkA = walkA.next;
            lenA--;
        }
        while(lenB > lenA){
            walkB = walkB.next;
            lenB--;
        }

        while(walkA != walkB){
            walkA = walkA.next;
            walkB = walkB.next;
        }

        return walkA;
    }
}