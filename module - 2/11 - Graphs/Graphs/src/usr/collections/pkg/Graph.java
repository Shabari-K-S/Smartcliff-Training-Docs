package usr.collections.pkg;

import java.util.*;

public class Graph<E> {
    private boolean isDirected;
    private boolean isWeighted;
    private final Map<E, List<Edge<E>>> graph;

    public static class Edge<E> {
        E target;
        int weight;

        Edge(E target, int weight) {
            this.target = target;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return target + "(" + weight + ")";
        }
    }

    public Graph() {
        this.graph = new HashMap<>();
    }

    public Graph(boolean isDirected) {
        this.graph = new HashMap<>();
        this.isDirected = isDirected;
    }

    public boolean isWeightedGraph() {
        return this.isWeighted;
    }


    public void addVertex(E vertex) {
        graph.putIfAbsent(vertex, new ArrayList<>());
    }

    public void removeVertex(E vertex) {
        graph.values().forEach(e -> e.removeIf(edge -> edge.target.equals(vertex)));
        graph.remove(vertex);
    }

    public ArrayList<E> getAllVertices() {
        return new ArrayList<>(graph.keySet());
    }

    public void addEdge(E vertex1, E vertex2) {
        this._addEdge(vertex1, vertex2, 1);  // Default weight for non-weighted graph
        this.isWeighted = false;
    }

    public void addEdge(E vertex1, E vertex2, int weight) {
        this._addEdge(vertex1, vertex2, weight);
        this.isWeighted = true;
    }

    private void _addEdge(E vertex1, E vertex2, int weight) {
        graph.putIfAbsent(vertex1, new ArrayList<>());
        graph.putIfAbsent(vertex2, new ArrayList<>());
        graph.get(vertex1).add(new Edge<>(vertex2, weight));
        if (!isDirected) {
            graph.get(vertex2).add(new Edge<>(vertex1, weight));
        }
    }

    public void removeEdge(E vertex1, E vertex2) {
        List<Edge<E>> edgesFromVertex1 = graph.get(vertex1);
        if (edgesFromVertex1 != null) edgesFromVertex1.removeIf(edge -> edge.target.equals(vertex2));
        if (!isDirected) {
            List<Edge<E>> edgesFromVertex2 = graph.get(vertex2);
            if (edgesFromVertex2 != null) edgesFromVertex2.removeIf(edge -> edge.target.equals(vertex1));
        }
    }

    public List<Edge<E>> getAdjVertices(E vertex) {
        return graph.getOrDefault(vertex, new ArrayList<>());
    }

    public Set<E> depthFirstTraversal(E start) {
        Set<E> visited = new LinkedHashSet<>();
        Stack<E> stack = new Stack<>();
        stack.push(start);
        while (!stack.isEmpty()) {
            E vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (Edge<E> edge : getAdjVertices(vertex)) stack.push(edge.target);
            }
        }
        return visited;
    }

    public Set<E> breadthFirstTraversal(E start) {
        Set<E> visited = new LinkedHashSet<>();
        Queue<E> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            E vertex = queue.poll();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (Edge<E> edge : getAdjVertices(vertex)) queue.add(edge.target);
            }
        }
        return visited;
    }

    public Map<E, ArrayList<Edge<E>>> adjacencyListRepr() {
        Map<E, ArrayList<Edge<E>>> adjListMap = new HashMap<>();
        for (E vertex : graph.keySet()) {
            adjListMap.put(vertex, new ArrayList<>(graph.get(vertex)));
        }
        return adjListMap;
    }

    @Override
    public String toString() {
        return depthFirstTraversal(graph.keySet().iterator().next()).toString();
    }

    public ArrayList<ArrayList<Integer>> adjacencyMatrixRepr() {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        List<E> vertices = getAllVertices();
        for (E vertex : vertices) {
            ArrayList<Integer> row = new ArrayList<>();
            for (E edge : vertices) {
                boolean found = false;
                for (Edge<E> e : graph.get(vertex)) {
                    if (e.target.equals(edge)) {
                        row.add((int) e.weight);
                        found = true;
                        break;
                    }
                }
                if (!found) row.add(0);
            }
            matrix.add(row);
        }
        return matrix;
    }

    private void topologicalSortUtil(
            int i,
            ArrayList<ArrayList<Integer>> matrix,
            boolean[] visited,
            Stack<E> stack,
            List<E> vertices
    ) {
        visited[i] = true;
        E vertex = vertices.get(i);

        for (Edge<E> edge : graph.get(vertex)) {
            int index = vertices.indexOf(edge.target);
            if (!visited[index]) topologicalSortUtil(index, matrix, visited, stack, vertices);
        }

        stack.push(vertex);
    }

    public ArrayList<E> topologicalSort() {
        if (!this.isDirected) {
            return new ArrayList<>(graph.keySet());
        }
        ArrayList<ArrayList<Integer>> matrix = this.adjacencyMatrixRepr();
        Stack<E> stack = new Stack<>();
        ArrayList<E> vertices = this.getAllVertices();
        boolean[] visited = new boolean[vertices.size()];

        for (int i = 0; i < vertices.size(); i++) {
            if (!visited[i]) this.topologicalSortUtil(i, matrix, visited, stack, vertices);
        }

        ArrayList<E> sortedVertices = new ArrayList<>();
        while (!stack.isEmpty()) {
            E vertex = stack.pop();
            sortedVertices.add(vertex);
        }
        return sortedVertices;
    }



    public Map<E, Integer> dijkstraAlgorithm(E start) {
        return this._dijkstraAlgorithm(start);
    }

    private Map<E, Integer> _dijkstraAlgorithm(E start) {
        PriorityQueue<VertexDistancePair<E>> pq = new PriorityQueue<>(Comparator.comparingInt(pair -> pair.distance));
        Map<E, Integer> distances = new HashMap<>();
        for (E vertex : graph.keySet()) {
            distances.put(vertex, Integer.MAX_VALUE);
        }
        distances.put(start, 0);
        pq.add(new VertexDistancePair<>(start, 0));

        while (!pq.isEmpty()) {
            VertexDistancePair<E> current = pq.poll();
            E currentVertex = current.vertex;

            for (Edge<E> edge : getAdjVertices(currentVertex)) {
                E targetVertex = edge.target;
                int newDist = distances.get(currentVertex) + edge.weight;
                if (newDist < distances.get(targetVertex)) {
                    distances.put(targetVertex, newDist);
                    pq.add(new VertexDistancePair<>(targetVertex, newDist));
                }
            }
        }
        return distances;
    }

    private static class VertexDistancePair<E> {
        E vertex;
        int distance;

        VertexDistancePair(E vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
    }



}
