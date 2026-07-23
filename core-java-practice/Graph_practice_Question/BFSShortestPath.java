import java.util.*;

public class BFSShortestPath {

    static List<Integer> shortestPath(Map<Integer, List<Integer>> graph, int start, int end) {

        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> parent = new HashMap<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(start);
        visited.add(start);
        parent.put(start, null);

        while (!queue.isEmpty()) {

            int node = queue.poll();

            if (node == end)
                break;

            for (int next : graph.getOrDefault(node, new ArrayList<>())) {

                if (!visited.contains(next)) {
                    visited.add(next);
                    parent.put(next, node);
                    queue.offer(next);
                }
            }
        }

        if (!visited.contains(end))
            return Collections.emptyList();

        LinkedList<Integer> path = new LinkedList<>();

        Integer current = end;

        while (current != null) {
            path.addFirst(current);
            current = parent.get(current);
        }

        return path;
    }

    public static void main(String[] args) {

        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(4));
        graph.put(3, Arrays.asList(4));
        graph.put(4, Arrays.asList(5));

        System.out.println(shortestPath(graph, 1, 5));
    }
}