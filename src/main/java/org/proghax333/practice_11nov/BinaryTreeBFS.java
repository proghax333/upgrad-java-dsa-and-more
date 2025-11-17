package org.proghax333.practice_11nov;

import java.util.LinkedList;
import java.util.Queue;

class Node<T> {
    T data;
    Node<T> left, right;

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> left, Node<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTreeBFS {
    public static <T> Node<T> node(T data, Node<T> left, Node<T> right) {
        return new Node<T>(data, left, right);
    }

    public static <T> Node<T> node(T data) {
        return node(data, null, null);
    }

    public static <T> void bfs(Node<T> root) {
        Queue<Node<T>> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()) {
            Node<T> n = q.remove();

            System.out.print(n.data + " ");

            if(n.left != null) {
                q.add(n.left);
            }

            if(n.right != null) {
                q.add(n.right);
            }
        }
    }

    public static void main(String[] args) {
        Node<Integer> root = node(
                10,
                node(20,
                        node(30),
                        node(40)
                ),
                node(50,
                        node(60),
                        node(70)
                )
        );

        bfs(root);
    }
}
