package Step_June.Hackathon.Trees;
import java.util.*;
public class PathSums {
    static class Node {
        long v;
        Node left, right;
        Node(long x) {
            v = x;
        }
    }
    static Node build(String[] t) {
        if (t.length == 0 || t[0].equals("N")) {
            return null;
        }
        Node root = new Node(Long.parseLong(t[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (!q.isEmpty() && i < t.length) {
            Node node = q.poll();
            if (!t[i].equals("N")) {
                node.left = new Node(Long.parseLong(t[i]));
                q.add(node.left);
            }
            i++;
            if (i < t.length) {
                if (!t[i].equals("N")) {
                    node.right = new Node(Long.parseLong(t[i]));

                    q.add(node.right);
                }
                i++;
            }
        }
        return root;
    }
    // BUG: this function contains a single bug. The reference run must report the
    // maximum root-to-leaf path sum, but this version does not.
    static long maxPathSum(Node node) {
        if (node.left == null && node.right == null) {
            return node.v;
        }
        long best = 0;
        boolean haveBest = false;
        if (node.left != null) {
            long s = maxPathSum(node.left);
            if (!haveBest || s > best) {
                best = s;
                haveBest = true;
            }
        }
        if (node.right != null) {
            long s = maxPathSum(node.right);
            if (!haveBest || s > best) {
                best = s;
                haveBest = true;
            }
        }
        return node.v + best;
    }
    // TODO: implement this. It must count root-to-leaf paths whose values sum to
    // exactly 'remaining' (the target passed from main). Currently a stub.
    static int countPaths(Node node, long remaining) {
        if(node == null){
            return 0;
        }
        long currentRemaining = remaining - node.v;
        if(node.left == null && node.right == null){
            return currentRemaining == 0 ? 1 : 0;
        }
        int paths = 0;
        if(node.left != null) {
            paths += countPaths(node.left, remaining);
        }
        if(node.right != null){
            paths += countPaths(node.right,remaining);
        }
        return paths;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String[] tokens = line1.trim().isEmpty() ? new String[0] : line1.trim().split("\\s+");
        long target = Long.parseLong(line2.trim());
        Node root = build(tokens);
        long mps = (root != null) ? maxPathSum(root) : 0;
        System.out.println("Max Path Sum: " + mps);
        System.out.println("Target Paths: " + countPaths(root, target));
    }
}
