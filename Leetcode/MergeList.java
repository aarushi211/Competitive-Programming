public class MergeList {
    Node head;
    public void addLast(Node node){
        {
            if (head == null) {
                head = node;
            }
            else {
                Node temp = head;
                while (temp.next != null)
                    temp = temp.next;
                temp.next = node;
            }
        }
    }
    void printlist(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        MergeList list1 = new MergeList();
        MergeList list2 = new MergeList();

        list1.addLast(new Node(0));
        list1.addLast(new Node(2));
        list1.addLast(new Node(3));
        list1.addLast(new Node(4));

        list2.addLast(new Node(1));
        list2.addLast(new Node(5));
        list2.addLast(new Node(10));
        list2.addLast(new Node(12));

        list1.head = new SortedList().sortedMerge(list1.head, list2.head);
        System.out.println("MergeList ");
        list1.printlist();
    }
}

class Node {
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

class SortedList{
    Node sortedMerge(Node head1, Node head2){
        Node temp = new Node(0);
        Node tail = temp;

        while(true){
            if(head1 == null){
                tail.next = head2;
                break;
            }
            if(head2 == null){
                tail.next = head1;
                break;
            }
            if(head1.data <= head2.data){
                tail.next = head1;
                head1 = head1.next;
            }else{
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        return temp.next;
    }
}
