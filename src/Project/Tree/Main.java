package Project.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

        void createNode(int n) {
            if (n < this.data) {
                if (this.left == null) this.left = new Node(n);
                else this.left.createNode(n);
            } else {
                if (this.right == null) this.right = new Node(n);
                else this.right.createNode(n);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Node root = new Node(Integer.parseInt(br.readLine()));
        while (true) {
            String data;
            data = br.readLine();
            if (data == null) {
                break;
            }
            root.createNode(Integer.parseInt(data));
        }
        postOrder(root);
    }

    private static void postOrder(Node node) {
        if (node.left != null) postOrder(node.left);
        if (node.right != null) postOrder(node.right);
        System.out.println(node.data);
    }
}
