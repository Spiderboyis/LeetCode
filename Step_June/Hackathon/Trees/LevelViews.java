package Step_June.Hackathon.Trees;
import java.util.*;
public class LevelViews {

    static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static Node BT(String[] nodes){
        if(nodes.length == 0 || nodes[0].equals("N")){
            return null;
        }
        Node root = new Node(Integer.parseInt(nodes[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while(!queue.isEmpty() && i < nodes.length){
            Node curr = queue.poll();
            if(i < nodes.length){
                if(!nodes[i].equals("N")){
                    curr.left = new Node(Integer.parseInt(nodes[i]));
                    queue.add(curr.left);
                }
                i++;
            }
            if(i < nodes.length){
                if(!nodes[i].equals("N")){
                    curr.right = new Node(Integer.parseInt(nodes[i]));
                    queue.add(curr.right);
                }
                i++;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        String[] nodes = {"1", "2", "3", "N", "5", "N", "4"};
        Node root = BT(nodes);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> rightView = new ArrayList<>();
        int maxLevelSum = Integer.MIN_VALUE;
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            int currentSum = 0;
            int lastVal = 0;
            for(int i = 0; i < levelSize; i++){
                Node curr = queue.poll();
                currentSum += curr.val;
                lastVal = curr.val;
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
            rightView.add(lastVal);
            if(currentSum > maxLevelSum){
                maxLevelSum = currentSum;
            }
        }
    }
}
