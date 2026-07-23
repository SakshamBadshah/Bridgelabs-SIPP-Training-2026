import java.util.*;

public class DFSAllPaths {

    static void findPaths(Map<Integer, List<Integer>> graph,
                          int current,
                          int destination,
                          List<Integer> path,
                          Set<Integer> visited,
                          List<List<Integer>> result) {

        path.add(current);
        visited.add(current);

        if (current == destination) {
            result.add(new ArrayList<>(path));
        } else {

            for (int next : graph.getOrDefault(current, new ArrayList<>())) {

                if (!visited.contains(next)) {
                    findPaths(graph, next, destination, path, visited, result);
                }
            }
        }

        path.remove(path.size() - 1);
        visited.remove(current);
    }

    public static void main(String[] args) {

        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(4));
        graph.put(3, Arrays.asList(4));
        graph.put(4, Arrays.asList(5));

        List<List<Integer>> result = new ArrayList<>();

        findPaths(graph, 1, 5, new ArrayList<>(), new HashSet<>(), result);

        System.out.println(result);
    }
}