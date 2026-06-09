package Step_June.Hackathon.DequeAndCircularLinkedList;
import java.util.*;
public class CarouselCaller {
    public static class Node{
        String name;
        Node next;

        public Node(String name){
            this.name = name;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        Node tail = null;
        for(int i = 0; i < n; i++){
            String name = sc.next();
            Node newNode = new Node(name);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        if(tail != null){
            tail.next = head;
        }
        if (!sc.hasNextInt()) return;
        int value = sc.nextInt();
        Node current = head;
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < value; i++){
            String str = sc.next();
            if(str.equals("CALL")){
                list.add(current.name);
                current = current.next;
            } else if(str.equals("ROTATE")){
                int k = sc.nextInt();
                for(int j = 0;  j < k; j++){
                    current = current.next;
                }
            }
        }
        System.out.print("Called:");
        for (String horse : list) {
            System.out.print(" " + horse);
        }
        System.out.println();
        System.out.println("Current: " + (current != null ? current.name : "None"));
    }
}
