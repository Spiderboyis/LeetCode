package Step_June;
import java.util.HashMap;
import java.util.HashSet;

public class June_9 {
    static class Node{
        int value;
        String key;
        Node next;

        public Node(String key,int value){
            this.key = key;
            this.value = value;
            this.next = null;
        }

        public Node(String key){
            this.key = key;
            this.value = 0;
            this.next = null;
        }
    }

    static class HashMap{
        int capacity;
        int size;
        Node[] collection;

        public HashMap(){
            this.capacity = 16;
            this.size = 0;
            this.collection = new Node[capacity];
        }

        public HashMap(int capacity){
            this.capacity = capacity;
            this.size = 0;
            this.collection = new Node[capacity];
        }

        private int getHash(String key, int value){
            int hash = 0;
            for(int i = 0; i < key.length(); i++){
                hash = (hash * 31 + key.charAt(i)) % value;
            }
            return hash;
        }

        private void rehash(){
            int newCapacity = this.capacity * 2;
            Node[] newCollection = new Node[newCapacity];
            for(int i = 0; i < this.capacity; i++ ){
                Node current = collection[i];
                while(current != null){
                    Node newNode = current.next;
                    int newHash = getHash(current.key,newCapacity);
                    current.next = newCollection[newHash];
                    newCollection[newHash] = current;
                    current = newNode;
                }
            }
            this.capacity = newCapacity;
            this.collection = newCollection;
        }

        public void put(String key,int value){
            int hash = getHash(key,this.capacity);
            Node current = collection[hash];
            while(current != null){
                if(current.key.equals(key)){
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            Node newNode = new Node(key,value);
            newNode.next = collection[hash];
            collection[hash] = newNode;
            this.size++;
            if((double)this.size/this.capacity >= 0.75){
                rehash();
            }
        }

        public int get(String key){
            int hash = getHash(key,this.capacity);
            Node current = collection[hash];
            while(current != null){
                if(current.key.equals(key)){
                    return current.value;
                }
                current = current.next;
            }
            return -1;
        }

        public void remove(String key){
            int hash = getHash(key,this.capacity);
            Node current = collection[hash];
            Node prev = null;
            while(current != null){
                if(current.key.equals(key)){
                    if(prev != null){
                        prev.next = current.next;
                    }else{
                        collection[hash] = current.next;
                    }
                    this.size--;
                    return;
                }
                prev = current;
                current = current.next;
            }
        }

        public boolean containsKey(String key){
            int hash = getHash(key,this.capacity);
            Node current = collection[hash];
            while(current != null){
                if(current.key.equals(key)){
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        public int size(){
            return this.size;
        }

        public boolean isEmpty(){
            if(this.size == 0){
                return true;
            }
            return false;
        }

        public void clear(){
            for(int i = 0; i < this.capacity; i++){
                collection[i] = null;
            }
            this.size = 0;
        }
    }

    static class Order{
        String id;
        String side;
        double price;
        double volume;
        Order next;

        public Order(String id,String side,double price,double volume){
            this.id = id;
            this.side = side;
            this.price = price;
            this.volume = volume;
        }
    }

    static class PriceLevelNode{
        double price;
        Order head;
        Order tail;
        PriceLevelNode left,right;
        public PriceLevelNode(double price){
            this.price = price;
        }
    }

    static class OrderBook{
        private PriceLevelNode bid;
        private PriceLevelNode ask;
        public PriceLevelNode addPrice(PriceLevelNode root,double price,boolean bid){
            if(root == null){
                return new PriceLevelNode(price);
            }
            if(price == root.price){
                return root;
            }
            if(bid){
                if(price > root.price){
                    root.left = addPrice(root.left,price,bid);
                }else{
                    root.right = addPrice(root.right,price,bid);
                }
            }else{
                if(price < root.price){
                    root.left = addPrice(root.left,price,bid);
                }else{
                    root.right = addPrice(root.right,price,bid);
                }
            }
            return root;
        }

        public void addOrder(String id,String side,double price,double volume){
            Order newOrder = new Order(id,side,price,volume);
            if(side.equals("BUY")){
                
            }
        }

    }

    public static void main(String[] args) {

    }
}
