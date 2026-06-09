package Step_June.Hackathon.StackAndQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class QueueFromTwoStack {
    private Stack<Integer> inbox;
    private Stack<Integer> outbox;

    public void enqueue(int value){
        inbox.push(value);
    }

    public Integer dequeue() {
        if(outbox.isEmpty()){
            while(!inbox.isEmpty()){
                outbox.push(inbox.pop());
            }
        }
        if(outbox.isEmpty()){
            return null;
        }
        return outbox.pop();
    }

    public int getPendingCount(){
        return inbox.size() + outbox.size();
    }

    public static void main(String[] args){
        QueueFromTwoStack queue = new QueueFromTwoStack();
        List<Integer> itemId = new ArrayList<>();
        String[] operations  = {
                "ENQUEUE 1",
                "ENQUEUE 2",
                "DEQUEUE",
                "ENQUEUE 3",
                "DEQUEUE"
        };

        for(String op : operations){
            String[] parts = op.split(" ");
            String segments = parts[0];
            if(segments.equals("ENQUEUE")){
                int id = Integer.parseInt(parts[1]);
                queue.enqueue(id);
            } else if(segments.equals("DEQUEUE")){
                Integer out = queue.dequeue();
                if (out != null) {
                   itemId.add(out);
                }
            }
        }
        for(int id : itemId){
            System.out.println(" " + id);
        }
        System.out.println();
        System.out.println("Pending count: " + queue.getPendingCount());
    }
}
