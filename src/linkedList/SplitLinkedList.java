package linkedList;

/**
 * Created by cuixiaodao on 12/17/2017
 * for leetCode problem:
 * https://leetcode.com/problems/split-linked-list-in-parts/description/
 */

public class SplitLinkedList{
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] ans = new ListNode[k];

        double len = 0;
        ListNode walk = root;
        while(walk != null){
            walk = walk.next;
            len++;
        }

        walk = root;
        
        double lenI; // len of ith parts
        for(int i=0; i<k; i++){
            lenI = Math.ceil(len/(k-i));
            len -= lenI;

            ans[i] = walk;
            if(lenI > 0){
                for(int j=0; j<lenI-1; j++) walk = walk.next;
                ListNode last = walk;
                walk = walk.next;
                last.next = null;
            }
        }
        return ans;
    }    
}