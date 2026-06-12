package Step_June;

public class June_11 {
    static class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value=value;
            this.left = null;
            this.right = null;
        }
    }
    static class BST{
        Node root;
        public BST(){
            root = null;
        }

        public void insert(int value){
            root = insertHelper(root,value);
        }

        private Node insertHelper(Node root,int value){
            if(root == null){
                root = new Node(value);
                return root;
            }
            if(value < root.value){
                root.left = insertHelper(root.left,value);
            }
            if(value > root.value){
                root.right = insertHelper(root.right,value);
            }
            return root;
        }

        int count = 0;
        int sum = 0;

        public void inOrder(Node root){
            inOrderHelper(root);
        }

        private void inOrderHelper(Node root){
            if(root != null){
                inOrderHelper(root.left);
                count++;
                sum += root.value;
                System.out.println(root.value);
                inOrderHelper(root.right);
            }
        }

        public int height(Node root){
            if(root == null){
                return -1;
            }
            return 1 + Math.max(height(root.left),height(root.right));
        }

        public int leaves(Node root){
            if(root == null){
                return -1;
            }
            return 1 + leaves(root.left);
        }

        public int interval(Node root){
            int result = 0;
            if(root == null){
                return -1;
            }
            if(root.left != null && root.right != null){
                result++;
                interval(root.left);
                interval(root.right);
            }
            return result;
        }
    }
}
