package Step_June.Hackathon.StackAndQueue;

public class CircularEventBuffer {
    public static void main(String[] args) {
        int capacity = 3;
        int count = 5;
        String[] logs = {"LOG 1", "LOG 2", "LOG 3", "LOG 4", "LOG 5"};
        int[] buffer = new int[capacity];
        int head = 0;
        int size = 0;
        int overwrite = 0;
        for(int i = 0; i < count; i ++){
            int num = Integer.parseInt(logs[i].split(" ")[1]);
            int write = (head + size) % capacity;
            if(size == capacity) {
                buffer[write] = num;
                head = (head + 1) % capacity;
                overwrite++;
            }else{
                buffer[write] = num;
                size++;
            }
        }
        System.out.println();
        for(int i = 0; i < size; i++){
            int index = (head + i) % capacity;
            System.out.print(" " + buffer[index]);
        }
        System.out.println();
        System.out.println("overwrite: " + overwrite);
    }
}
