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
public class Graph {
      private boolean adjMatrix[][];
      private int numNode;
 
      public Graph(int numNode) {
          this.numNode = numNode;
          adjMatrix = new boolean[numNode][numNode];
    }
 
      public void addEdge(int i, int j) {
                adjMatrix[i][j] = true;
                adjMatrix[j][i] = true;
    }
 
      public void removeEdge(int i, int j) {
                adjMatrix[i][j] = false;
                adjMatrix[j][i] = false;
    }
 
      public boolean isEdge(int i, int j) {
                  return adjMatrix[i][j];
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < numNode; i++) {
            for (boolean j : adjMatrix[i]) {
                string.append((j?1:0) + " ");
            }
            string.append("\n");
        }
        return string.toString();
    }

}
