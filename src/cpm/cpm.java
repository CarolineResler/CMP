/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpm;

/**
 *
 * @author Caroline
 */
public class cpm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph g = new Graph(10);

        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(0, 4);
        g.addEdge(1, 7);
        g.addEdge(2, 5);
        g.addEdge(3, 6);
        g.addEdge(4, 7);
        g.addEdge(5, 9);
        g.addEdge(6, 9);
        g.addEdge(7, 8);
        g.addEdge(8, 9);

        System.out.print(g.toString());
        System.out.print("the topological sort is " + topologicalSort(g));
        node [] array = new node [10];
        //aString name, int It, int ES, int EF, int LS, int LF
        
    }

    public static int[] topologicalSort(Graph g) {
        int n = 10;
        boolean[] visited = new boolean[n];
        int[] order = new int[n];
        int index = n - 1;
        for (int u = 0; u < n; u++) {
            if (!visited[u]) {
                index = visit(g, visited, order, index, u);
            }
        }
        return order;

    }

    private static int visit(Graph adj, boolean[] visited, int[] order, int index, int u) {

        if (visited[u]) {
            return index;
        }
        visited[u] = true;
        for (int v = 0; v < 10; v++) {
            if (adj.isEdge(u, v) != false && !visited[v]) {
                index = visit(adj, visited, order, index, v);
            }
        }

        order[index--] = u;

        return index;
    }
}
