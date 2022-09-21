package MentorWeek22.removeDuplicates;

public class MyLinkedList {
    public Node head;
    public Node tail;
    public MyLinkedList() {
        head = tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public boolean add(Integer element) {
        if (isEmpty()) {
            tail = new Node(element);
            head = tail;
            } else {
            Node prev = tail;
            tail = new Node(element);
            prev.next = tail;
        }
        return false;
    }
    public boolean removeDuplicatesByMe() {
        if (isEmpty() || head.next == null) return false; //nothing to remove from empty or 1 element list
        Node current = head,prev = head;   //initializing the markers
outer:
        while (!current.equals(tail)) {   //while current marker is not tail we are doing our outer loop
            prev = current;                 // Preparing for compare:
                                            //in first iteration first marker(prev) points on first element
                                            //second marker(current) points on second element
            current = current.next;         // in every other iteration we are moving both markers forward 1 step

            while (current.value == prev.value) { //while values from both markers are equal we are doing inner loop
                prev.next = current.next;      //we are removing element on which second marker points
                if (current.equals(tail)) break outer; //if our second marker is tail we are done
                current = prev.next;           //moving second marker forward 1 step
            }
        }
        return true;                        // we successfully removed duplicates
    }

    public boolean removeDuplicatesTwoPointer() {
        if (head == null || head.next == null) ;
        Node slow = head;
        Node fast = head.next;
        while (fast != null) {
            if (slow.value == fast.value) {
                fast = fast.next;
                slow.next = fast;
            } else {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return true;
    }

    public String toString() {
        Node current = head;
        String result = "";
        while (current != null) {
            Node prev = current;
            result += current.value + " ";
            current = current.next;
        }
        return result;
    }
}
