package com.pavi.learning.java.graph;

import java.util.Arrays;

public class GraphMatrix {

    private int[][] matrix;
    private int vertices;

    public GraphMatrix(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    public void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;
    }

    public void printGraph() {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {

        GraphMatrix graph = new GraphMatrix(5);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(2,0);
        graph.addEdge(2,0);
        graph.addEdge(2,1);
        graph.addEdge(2,3);
        graph.addEdge(4,3);

        graph.printGraph();

    }
}
