package lintcode.q814;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Solution {
    public int shortestPath(List<UndirectedGraphNode> graph, UndirectedGraphNode A, UndirectedGraphNode B) {
        // Write your code here
        Map<UndirectedGraphNode, Boolean> visited = new Hashtable<>(graph.size());
        Map<UndirectedGraphNode, Integer> distance = new Hashtable<>(graph.size());
        for (UndirectedGraphNode node : graph) {
            visited.put(node, false);
            distance.put(node, Integer.MAX_VALUE);
        }
        distance.put(A, 0);
        BFS(visited, distance, A);
        return distance.get(B);
    }

    public void BFS(Map<UndirectedGraphNode, Boolean> visited, Map<UndirectedGraphNode, Integer> distance, UndirectedGraphNode currentNode) {
        visited.put(currentNode, true);
        for (UndirectedGraphNode node : currentNode.neighbors) {
            distance.put(node, Math.min(distance.get(currentNode) + 1, distance.get(node)));
        }
        for (UndirectedGraphNode node:currentNode.neighbors){
            if(!visited.get(node)) {
                BFS(visited, distance, node);
            }
        }
        visited.put(currentNode, true);
    }
}
