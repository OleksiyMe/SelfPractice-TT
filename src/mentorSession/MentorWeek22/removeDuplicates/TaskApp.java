package mentorSession.MentorWeek22.removeDuplicates;

public class TaskApp {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(6);


        System.out.println(list);
   //     System.out.println(list.removeDuplicatesByMe());
        list.removeDuplicatesTwoPointer();
        System.out.println(list);


    }
}
