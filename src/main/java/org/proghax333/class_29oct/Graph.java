package org.proghax333.class_29oct;

import java.util.*;

public class Graph {

    private int numVertices;

    private Map<Integer, List<Integer>> adjacencyList;

    public Graph(int numVertices){
        this.numVertices = numVertices;

        adjacencyList = new HashMap<>();

        for (int i=0; i< numVertices;i++){
            adjacencyList.put(i,new LinkedList<>());
        }
    }

    public void addEdge(int source, int destination){

        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // for undirected graph

    }

    public void removeEdge(int source, int destination){

        adjacencyList.get(source).remove(Integer.valueOf(destination));
        adjacencyList.get(destination).remove(Integer.valueOf(source)); // for undirected graph

    }


    public void printGraph(){
        System.out.println("Graph Adjacency List :");

        for (int i=0; i < numVertices; i++){
            System.out.print(i + " -> ");
            for (int n: adjacencyList.get(i)){
                System.out.print(n+ " ");
            }
            System.out.println();
        }
    }

    public void bfs(int startVertex) {
        boolean[] visited = new boolean[numVertices];

        bfsHelper(startVertex, visited);
    }

    private void bfsHelper(int startVertex, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;

        queue.add(startVertex);

        while(!queue.isEmpty()){
            int currentVertex = queue.remove();
            System.out.print(currentVertex + " ");
            for (int neighbor : adjacencyList.get(currentVertex)){
                if (!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

        for(int i = 0; i < numVertices; ++i) {
            if(!visited[i]) {
                bfsHelper(i, visited);
                return;
            }
        }
    }


    public void dfs(int startVertex){
        boolean visited[] = new boolean[numVertices];

        dfsRecursive(startVertex, visited);

        for(int i = 0; i < numVertices; ++i) {
            if(!visited[i]) {
                dfsRecursive(i, visited);
            }
        }
    }

    private void dfsRecursive(int currentVertex, boolean[] visited) {
        visited[currentVertex] = true;
        System.out.print(currentVertex+ " ");
        for(int neighbor : adjacencyList.get(currentVertex)){
            if (!visited[neighbor]){
                dfsRecursive(neighbor, visited);
            }
        }
    }


    public static void main(String[] args) {

        int numVertices = 8;
        Graph gp = new Graph(numVertices);

        gp.addEdge(0,1);
        gp.addEdge(0,4);
        gp.addEdge(1,2);
        gp.addEdge(1,4);
        gp.addEdge(2,3);
        gp.addEdge(3,4);

        gp.addEdge(5, 6);
        gp.addEdge(5, 7);


//        gp.removeEdge(1,4);

//        gp.printGraph();


        gp.bfs(0);
        System.out.println();
        gp.dfs(0);
        System.out.println();

    }
}
