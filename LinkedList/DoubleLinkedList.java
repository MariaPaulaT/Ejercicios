package LinkedList;

class DoubleNode {
    int data;
    DoubleNode next;
    DoubleNode prev;

    // constructor to create a new node
    DoubleNode(int d) {
        data = d;
        next = null;
        prev = null;
    }
}

class DoubleLinkedList {
    DoubleNode head;
    DoubleNode tail;
    int length;

    // constructor to initialize the linked list
    DoubleLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

        // append method to add a new node to the end of the linked list
        public void append(int data) {
            DoubleNode newNode = new DoubleNode(data);
            if (this.head == null) {
                this.head = newNode;
                this.tail = newNode;
            } else {
                this.tail.next = newNode;
                newNode.prev = this.tail;
                this.tail = newNode;
            }
            this.length++;
        }
    

        public void prepend(int data) {
            DoubleNode newNode = new DoubleNode(data);
            if (this.head == null) {
                this.head = newNode;
                this.tail = newNode;
            } else {
                newNode.next = this.head;
                this.head.prev = newNode;
                this.head = newNode;
            }
            this.length++;
        }

        public void printList() {
            DoubleNode current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
        
       
    // insert method to add a new node at a given index
    public void insert(int index, int value) {
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            prepend(value);
            return;
        }
        if (index == length) {
            append(value);
            return;
        }
        DoubleNode before = head;
        DoubleNode after = head.next;
        while (index != 1) {
            before = before.next;
            after = after.next;
            index--;
        }
        DoubleNode newNode = new DoubleNode(value);
        newNode.next = after;
        newNode.prev = before;
        before.next = newNode;
        after.prev = newNode;
        length++;
    }
    
    // remove method to remove a node from the linked list
    public void remove(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            this.head = this.head.next;
            this.head.prev = null;
        } else if (index == length - 1) {
            this.tail = this.tail.prev;
            this.tail.next = null;
        } else {
            DoubleNode before = head;
            DoubleNode after = head.next;
            while (index != 0) {
                before = before.next;
                after = after.next;
                index--;
            }
        }
    }
}
