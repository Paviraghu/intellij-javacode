package com.pavi.learning.java.graph;

import java.util.*;

public class GraphDFSUsingStack {

    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addEdge(int source, int destination) {
        adjList.putIfAbsent(source, new ArrayList<>());
        adjList.putIfAbsent(destination, new ArrayList<>());
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    public void dfs(int start) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();

        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited.contains(node)) {
                System.out.print(node + " ");
                visited.add(node);

                List<Integer> neighbors = adjList.getOrDefault(node, new ArrayList<>());
                Collections.reverse(neighbors);
                for (int neighbor : neighbors) {
                    stack.push(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {

        GraphDFSUsingStack graph = new GraphDFSUsingStack();

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 4);

        System.out.print("DFS Traversal: ");

        graph.dfs(0);
    }
}
