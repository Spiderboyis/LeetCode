package Step_June;
import java.util.Scanner;
public class June_15 {
    static class AVL{
        static class Node{
            int value;
            Node left;
            Node right;
            int height;
            public Node(int value){
                this.value = value;
            }
        }

        private Node root;

        public AVL(){

        }

        public int height(){
            return height(root);
        }
        private int height(Node node){
            if(node == null){
                return -1;
            }
            return node.height;
        }

        public void insert(int value){
            insert(value,root);
        }
        private Node insert(int value,Node node){
            if(node == null){
                node = new Node(value);
                return node;
            }
            if(node.value > value){
                node.left = insert(value,node.left);
            }
            if(node.value < value){
                node.right = insert(value,node.right);
            }
            node.height = Math.max(height(node.left), height(node.right)) + 1;
            return rotate(node);
        }

        private Node rightRotate(Node P){
            Node C = P.left;
            Node temp = C.right;

            C.right = P;
            P.left = temp;

            P.height = Math.max(height(P.left), height(P.right)) + 1;
            C.height = Math.max(height(C.left), height(C.right)) + 1;

            return C;
        }

        private Node leftRotate(Node C){
            Node P = C.right;
            Node temp = P.left;

            P.left = C;
            C.right = temp;

            P.height = Math.max(height(P.left), height(P.right)) + 1;
            C.height = Math.max(height(C.left), height(C.right)) + 1;
            return P;
        }

        private Node rotate(Node node){
            if(height(node.left) - height(node.right)> 1){
                if(height(node.left.left) - height(node.left.right) > 0){
                    return rightRotate(node);
                }
                if(height(node.left.left) - height(node.left.right) < 0){
                    node.left = leftRotate(node.left);
                    return rightRotate(node);
                }
            }
            if(height(node.left) - height(node.right) < -1) {
                if (height(node.right.left) - height(node.right.right) < 0) {
                    return leftRotate(node);
                }
                if (height(node.right.left) - height(node.right.right) > 0) {
                    node.right = rightRotate(node.right);
                    return leftRotate(node);
                }
            }
            return node;
        }


    }

    public static void main(String[] args) {

    }
}
