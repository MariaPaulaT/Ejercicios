package LinkedList;

class Node {
    int data;
    Node next;

    // constructor to create a new node
    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;
    int length;

    // constructor to initialize the linked list
    LinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
    // method to append a new node to the linked list
    public void append(int data) {
        // if the head node is null, create a new node and set it as the head
        if (head == null) {
            head = new Node(data);
            tail = head;
            length++;
            return;
        }

        // create a new node and set it as the next node of the last node (tail)
        tail.next = new Node(data);
        tail = tail.next;
        length++;
    }

    public void preppend(int data){
        if(head == null){
            head = new Node(data);
            tail = head;
            length ++;
            return;
        }

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        length++;

        }

        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
        
        public void insert(int index, int value) {
            if (index < 0 || index > length) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            if (index == 0) {
                preppend(value);
                return;
            }
            if (index == length) {
                append(value);
                return;
            }
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node newNode = new Node(value);
            newNode.next = current.next;
            current.next = newNode;
            length++;
        }

        public void remove(int index) {
            if (index < 0 || index >= length) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            if (index == 0) {
                head = head.next;
                length--;
                return;
            }
            Node before = head;
            Node current = head.next;
            for (int i = 1; i < index; i++) {
                before = current;
                current = current.next;
            }
            before.next = current.next;
            length--;
        }

}