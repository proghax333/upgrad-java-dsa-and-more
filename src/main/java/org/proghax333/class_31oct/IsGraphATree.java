package org.proghax333.class_31oct;

import java.util.*;

public class IsGraphATree {

    static boolean helper(int[][] adjacencyMatrix, int x, boolean[] visited, int parent) {
        int n = adjacencyMatrix.length;

        for(int i = 0; i < n; ++i) {
            if(adjacencyMatrix[x][i] == 1) {
                if(!visited[i]) {
                    visited[i] = true;
                    return helper(adjacencyMatrix, i, visited, x);
                } else if(parent != i) {
                    return false;
                }
            }
        }

        return false;
    }

    public static boolean isGraphATree(int[][] adjacencyMatrix) {
        int n = adjacencyMatrix.length;

        if(n <= 1) {
            return true;
        }

        boolean[] visited = new boolean[n];
        boolean hasCycles = helper(adjacencyMatrix, 0, visited, -1);

        if(hasCycles) {
            return false;
        }

        for(boolean x : visited) {
            if(!x) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 6;
        int[][] adjMatrix = new int[n][n];

        int[][] edges = {
                {0, 1},
                {0, 2},
                {2, 3},
                {2, 4},
                {4, 5}
        };

        // Fill adjacency matrix (undirected)
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1;
        }

        System.out.println(isGraphATree(adjMatrix));
    }
}
