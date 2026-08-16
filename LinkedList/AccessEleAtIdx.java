package LinkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class AccessEleAtIdx {


    public static int get(Node head, int idx){
        for(int i = 0; i <= idx; i++){
            head = head.next;
        }
        return head.val;
    }
    public static void main(String[] args){
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        //Link
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(get(a,2));
    }
}
