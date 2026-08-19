public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public int get(int index) {
        if (index >= size || index < 0) {
            return -1;
        }
        Node temp = head;
        
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        } 
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        
        if (this.size == 0) {
            tail = head;
        }
        this.size++;
    }
    
    public void addAtTail(int val) {
        if (this.size == 0) {
            addAtHead(val);
            return;
        }
        
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        this.size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index > this.size || index < 0) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == this.size) {
            addAtTail(val);
            return;
        }

        Node current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        
        Node node = new Node(val);
        node.next = current.next;
        current.next = node;
        this.size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        if (index == 0) {
            head = head.next;
            if (head == null) {
                tail = null; 
            }
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            
            temp.next = temp.next.next;
            
            if (temp.next == null) {
                tail = temp;
            }
        }
        this.size--;
    }

    private class Node {
        private int val;
        private Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}