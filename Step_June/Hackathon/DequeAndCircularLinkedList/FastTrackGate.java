package Step_June.Hackathon.DequeAndCircularLinkedList;
import java.util.*;
public class FastTrackGate {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        ArrayList<Integer> boarded = new ArrayList<>();
        ArrayList<Integer> quit = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String command = sc.next();
            if(command.equals("VIP")){
                int id = sc.nextInt();
                deque.addFirst(id);
            }
            if(command.equals("REGULAR")){
                int id = sc.nextInt();
                deque.addLast(id);
            }
            if(command.equals("BOARD")){
                if(!deque.isEmpty()){
                    boarded.add(deque.removeFirst());
                }
            }
            if(command.equals("QUIT")){
                if(!deque.isEmpty()){
                    quit.add(deque.removeLast());
                }
            }
        }
        System.out.print("Boarded:");
        for(int id : boarded) System.out.print(" " + id);
        System.out.println();

        System.out.print("Quit:");
        for(int id : quit) System.out.print(" " + id);
        System.out.println();

        System.out.print("Waiting:");
        for(int id : deque) System.out.print(" " + id);
        System.out.println();
    }
}
