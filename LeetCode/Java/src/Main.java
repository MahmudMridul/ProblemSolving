import Example.InnerClass.Outer;
import Graph.GraphAlgorithms;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        GraphAlgorithms ga = new GraphAlgorithms();
        ArrayList<ArrayList<Integer>> graph = ga.createUndirectedUnweightedGraph("src\\Resources\\undunw.txt");
        ga.breadthFirstSearch(graph, 1);
    }
}
class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        Set<Integer> first = new HashSet<>(n);
        Set<Integer> second = new HashSet<>(n);

        for(int i = 0; i < dislikes.length; ++i) {
            int one = dislikes[i][0];
            int two = dislikes[i][1];

            if(!first.contains(one) && !second.contains(one)) {
                first.add(one);

                if(first.contains(two)) {
                    return false;
                }
                if(!second.contains(two)) {
                    second.add(two);
                }
            }
            else if(first.contains(one)) {
                if(first.contains(two)) {
                    return false;
                }
                if(!second.contains(two)) {
                    second.add(two);
                }
            }
            else if(second.contains(one)) {
                if(second.contains(two)) {
                    return false;
                }
                if(!first.contains(two)) {
                    first.add(two);
                }
            }
        }

        return true;
    }
}