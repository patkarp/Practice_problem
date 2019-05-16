/**Java code

Node Reverse(Node head) {
    Node next = null, prev = null, current = head;
    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    head = prev;
    return head;
} */