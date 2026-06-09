package Step_June;
import java.util.*;
public class June_8 {

    static class Node{
        int value;
        String key;
        Node next;

        public Node(int value,String key){
            this.value = value;
            this.key = key;
            this.next = null;
        }
    }

    static class HashMap{
        private int capacity;
        private int size;
        private Node[] collection;

        public HashMap(){
            this.capacity = 32;
            this.size = 0;
            this.collection = new Node[this.capacity];
        }

        private int getHash(String key, int currentCapacity){
            long hash = 0;
            for(int i = 0; i < key.length(); i++){
                hash = (hash * 31 + key.charAt(i)) % currentCapacity;
            }
            return (int) hash;
        }

        private void rehash(){
            int newCapacity = this.capacity * 2;
            Node[] newCollection = new Node[newCapacity];

            for(int i = 0; i < this.capacity; i++){
                Node current = collection[i];
                while(current != null){
                    Node newNode = current.next;
                    int newHash = getHash(current.key, newCapacity);
                    current.next = newCollection[newHash];
                    newCollection[newHash] = current;
                    current = newNode;
                }
            }
            this.capacity = newCapacity;
            this.collection = newCollection;
        }

        public void put(String key, int value){
            int hash = getHash(key, this.capacity);
            Node current = collection[hash];
            while(current != null){
                if(current.key.equals(key)){
                    current.value = value;
                    return;
                }
                current = current.next;
            }

            Node newNode = new Node(value,key);
            newNode.next = collection[hash];
            collection[hash] = newNode;
            this.size++;

            if((double) this.size / this.capacity >= 0.75){
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
                if (current.key.equals(key)) {
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

        public int getSize(){
            return this.size;
        }

        public int getCapacity(){
            return this.capacity;
        }

    }

    static class MyHashSet{
        private int tombstone = -2;
        private int[] hash;
        public MyHashSet(){}
        private int[] table;
        private int capacity;
        private int size;
        private int occupied;

        public MyHashSet(int capacity){
            this.capacity = capacity;
            this.size = 0;
            this.occupied = 0;
            this.table = new int[capacity];
            for(int i = 0; i < capacity; i++){
                this.table[i] = -1;
            }
        }

        private int getHash(int key,int capacity){
            return key % capacity;
        }

        private void rehash(){
            int newCapacity = this.capacity * 2;
            Node[] newTable = new Node[newCapacity];

        }

        public void add(int key){
            int hash = getHash(key,this.capacity);

        }

        public void removie(int key){
            int hash = getHash(key,this.capacity);
            for(int i = 0; i < this.capacity; i++){
                int index = (hash + i) % capacity;
                if(table[index] == -1){
                    return;
                }
                if(table[index] == key){
                    table[index] = tombstone;
                    size--;
                    return;
                }
            }
        }

        public boolean contains(int key){
            int hash = getHash(key,this.capacity);
            for(int i = 0; i < this.table.length; i++){
                int index = (hash + i) % capacity;
                if(table[index] == -1){
                    return false;
                }
                if(table[index] == key){
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
