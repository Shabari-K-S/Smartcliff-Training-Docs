package usr.practice.test;

import usr.collections.pkg.Graph;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Graph<Integer> graph = getStringGraph();

        Set<Integer> dfsResult = graph.depthFirstTraversal(0);
        System.out.println("\nDepth-First Traversal starting from Shabari: " + dfsResult);

        Set<Integer> bfsResult = graph.breadthFirstTraversal(0);
        System.out.println("\nBreadth-First Traversal starting from Shabari: " + bfsResult);

        System.out.println("\nAdjacency List Representation: ");
        Map<Integer, ArrayList<Graph.Edge<Integer>>> val = graph.adjacencyListRepr();
        for(Integer str: val.keySet()) {
            System.out.println(str + " -> " + val.get(str));
        }

        System.out.println(graph);
        System.out.println("\nAdjacency Matrix Representation: ");
        for (ArrayList<Integer> i : graph.adjacencyMatrixRepr()) {
            System.out.println(i);
        }

        System.out.println("Is Weighted Graph: " + graph.isWeightedGraph());

        System.out.println("Topological Sort: " + graph.topologicalSort());
    }

    private static Graph<Integer> getStringGraph() {
        Graph<Integer> graph = new Graph<>(true);
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        return graph;
    }
}