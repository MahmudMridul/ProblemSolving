package Graph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class GraphAlgorithms {

    public ArrayList<ArrayList<Integer>> createUndirectedUnweightedGraph(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line = reader.readLine();
            StringTokenizer tokenizer = new StringTokenizer(line, " ");

            int numberOfVetexes = Integer.parseInt(tokenizer.nextToken());
            int numberOfEdges = Integer.parseInt(tokenizer.nextToken());

            ArrayList<ArrayList<Integer>> graph = new ArrayList<>(numberOfVetexes);

            for(int vertex = 0; vertex < numberOfVetexes; ++vertex) {
                graph.add(new ArrayList<>(numberOfVetexes));
            }

            while(numberOfEdges-- > 0) {
                line = reader.readLine();
                tokenizer = new StringTokenizer(line, " ");

                int vertex = Integer.parseInt(tokenizer.nextToken());
                int neighbour = Integer.parseInt(tokenizer.nextToken());

                graph.get(vertex).add(neighbour);
                graph.get(neighbour).add(vertex);
            }
            return graph;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public void breadthFirstSearch(ArrayList<ArrayList<Integer>>graph, int source) {
        if(graph == null) return;

        Queue<Integer> queue = new ArrayDeque<>(graph.size());
        boolean[] visited = new boolean[graph.size()];

        queue.add(source);
        visited[source] = true;

        while(!queue.isEmpty()) {
            int vertex = queue.poll();
            ArrayList<Integer> neighbourList = graph.get(vertex);
            System.out.println(vertex);

            for(int neighbour : neighbourList) {
                if(!visited[neighbour]) {
                    queue.add(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
    }

    public void depthFirstSearch(ArrayList<ArrayList<Integer>>graph, int source) {
        if(graph == null) return;

        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[graph.size()];

        stack.push(source);
        visited[source] = true;

        while(!stack.isEmpty()) {
            int vertex = stack.pop();
            ArrayList<Integer> neighbourList = graph.get(vertex);
            System.out.println(vertex);

            for(int neighbour : neighbourList) {
                if(!visited[neighbour]) {
                    stack.push(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
    }

    private boolean canSet(int vertex, int color, ArrayList<ArrayList<Integer>>graph, int[] vertexColor) {
        ArrayList<Integer> neighbourList = graph.get(vertex);

        for(int neighbour : neighbourList) {
            if(color == vertexColor[neighbour]) {
                return false;
            }
        }
        return true;
    }

    private boolean helper(ArrayList<ArrayList<Integer>>graph, int[] vertexColor, int numOfColors, int vertex) {
        if(vertex == graph.size()) return true;

        for(int color = 1; color <= numOfColors; ++color) {
            if(canSet(vertex, color, graph, vertexColor)) {
                vertexColor[vertex] = color;

                if(helper(graph, vertexColor, numOfColors, vertex + 1)) {
                    return true;
                }
                vertexColor[vertex] = 0;
            }
        }
        return false;
    }

    public boolean graphColoring(ArrayList<ArrayList<Integer>>graph, int numOfColors) {
        int[] vertexColor = new int[graph.size()];

        if(!helper(graph, vertexColor, numOfColors, 0)) {
            return false;
        }

        for(int color : vertexColor) {
            System.out.print(color + " ");
        }
        System.out.println();
        return true;
    }
}
