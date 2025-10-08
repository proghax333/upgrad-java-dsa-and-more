package org.proghax333.class_08oct;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.function.Consumer;

class Node<T> {
    private T data;
    private Node<T> left;
    private Node<T> right;

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> left, Node<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
}

class BinaryTree<T> {
    private Node<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(Node<T> root) {
        this.root = root;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public void preorder(Node<T> node, Consumer<T> consumer) {
        if(node == null) {
            return;
        }

        Stack<Node<T>> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()) {
            Node<T> n = stack.pop();

            if(n == null) {
                continue;
            }

            consumer.accept(n.getData());
            stack.push(n.getRight());
            stack.push(n.getLeft());
        }
    }

    public void inorder(Node<T> node, Consumer<T> consumer) {
        if(node == null) {
            return;
        }

        Stack<Node<T>> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()) {
            Node<T> n = stack.pop();

            if(n == null) {
                continue;
            }

            stack.push(n.getRight());
            consumer.accept(n.getData());
            stack.push(n.getLeft());
        }
    }


    public void postorder(Node<T> node, Consumer<T> consumer) {
        if(node == null) {
            return;
        }

        Stack<Node<T>> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()) {
            Node<T> n = stack.pop();

            if(n == null) {
                continue;
            }

            stack.push(n.getRight());
            stack.push(n.getLeft());
            consumer.accept(n.getData());
        }
    }

    public void bfs(Node<T> node, Consumer<T> consumer) {
        if(node == null) {
            return;
        }

        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()) {
            Node<T> n = queue.remove();

            if(n == null) {
                continue;
            }

            consumer.accept(n.getData());
            queue.add(n.getLeft());
            queue.add(n.getRight());
        }
    }
}

public class BinaryTreeTraversals {
    public static <T> Node<T> node(T data) {
        var node = new Node<>(data);
        return node;
    }
    public static <T> Node<T> node(T data, Node<T> left, Node<T> right) {
        var node = new Node<>(data);
        node.setLeft(left);
        node.setRight(right);

        return node;
    }

    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.setRoot(
            node(10,
                    node(20,
                            node(22),
                            node(24)
                    ),
                    node(30,
                            node(35),
                            node(40)
                    )
            )
        );

        tree.preorder(tree.getRoot(), (x) -> {
            System.out.print(x + " ");
        });

        System.out.println("\n");

        tree.bfs(tree.getRoot(), (x) -> {
            System.out.print(x + " ");
        });
    }
}
