package Step_June.Hackathon.DequeAndCircularLinkedList;
import java.util.*;
public class ParadePalindrome {
    static int mismatched = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            deque.add(str.charAt(i));
        }
        while (!deque.isEmpty()) {
            if(deque.getFirst() == deque.getLast()) {
                deque.removeFirst();
                deque.removeLast();
            }else{
                mismatched++;
                deque.removeFirst();
                deque.removeLast();
            }
        }

        if(mismatched == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        System.out.println("Mismatched: " + mismatched);

        //        System.out.println(isPalindrome(str) ? "YES" : "NO");
//        System.out.println(mismatched);
    }

//    public static boolean isPalindrome(String str){
//        int front = 0;
//        int back = str.length() - 1;
//        while(front < back){
//            if(str.charAt(front) == str.charAt(back)) {
//                front++;
//                back--;
//            }else{
//                front++;
//                back--;
//                mismatched++;
//            }
//        }
//        if(mismatched == 0){
//            return true;
//        } else{
//            return false;
//        }
//    }
}
