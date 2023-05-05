package mentorSession.MentorWeek22.palindrome;

public class MyDoubleLinkedList<T> {

    Node<T> head;
    Node<T> tail;
   public boolean isEmpty() {
        return head == null||tail==null;
    }

    public boolean add(Character element) {
        if (isEmpty()) {
            head = new Node(element);
            tail = head;
        } else {
            Node prev = tail;
            tail = new Node(element);
            prev.next = tail;
            tail.previous = prev;
        }
        return false;
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
    public String toStringReverse() {
        Node current = tail;
        String result = "";
        while (current != null) {
            Node prev = current;
            result += current.value + " ";
            current = current.previous;
        }
        return result;
    }
}
