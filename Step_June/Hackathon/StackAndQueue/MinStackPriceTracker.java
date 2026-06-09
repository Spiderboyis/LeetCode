package Step_June.Hackathon.StackAndQueue;

import java.util.*;

public class MinStackPriceTracker {
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();

    public static void push(int price){
        stack.push(price);
        if(minStack.isEmpty()){
            minStack.push(price);
        }else{
            int currentMin = minStack.peek();
            minStack.push(Math.min(currentMin,price));
        }
    }

    public static void pop(){
        if(!stack.isEmpty()){
            stack.pop();
            minStack.pop();
        }
    }

    public static void getMin(){
        if(minStack.isEmpty()){
            System.out.println("Empty Stack");
        }else{
            System.out.println(minStack.peek());
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            if (command.equals("PUSH")) {
                int price = sc.nextInt();
                push(price);
            } else if (command.equals("POP")) {
                pop();
            } else if (command.equals("MIN")) {
                getMin();
            }
        }
        System.out.println("Size: " + minStack.size());
        sc.close();
    }
}
