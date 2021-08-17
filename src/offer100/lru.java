// https://leetcode-cn.com/problems/lru-cache/solution/
class LRUCache {
    private int capacity = 0;
    private Node head;
    private Node last;
    private Map<Integer, Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<Integer, Node>(capacity);
    }
    
    public int get(int key) {
        Node node = map.get(key);
        if (null != node) {
            moveNodeFirst(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        Node node = map.get(key);
        if (null == node) {
            if (map.size() == capacity) {
                removeLast();
            }
            node = new Node();
            node.key = key;
            node.value = value;
            map.put(key, node);
        } else {
            node.value = value;
        }      
        moveNodeFirst(node);        
    }

    private void removeLast() {
        if (null == last) {
            return;
        }
        map.remove(last.key);

        if (last != head) {
            last.pre.next = null;
            last = last.pre;
        } else {
            last = null;
            head = null;
        }

    }

    private void moveNodeFirst(Node node) {
        if (null == head) {
            head = node;
            last = node;
            return;
        }

        if (node == head) {
            return;
        }

        if (node == last) {
            last = node.pre;
            last.next = null;
            node.pre = null;
            node.next = head;
            head.pre = node;
            head = node;
            return;
        }

        // 链中节点
        if (node.pre != null) {
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }

        // 全新节点
        node.pre = null;
        node.next = head;
        head.pre = node;
        head = node;      
    }

    class Node {
        Node pre;
        Node next;
        int key;
        int value;
    }    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
