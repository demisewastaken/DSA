class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(0, graph.length - 1, result, path, graph);
        return result;
    }

    public void dfs(int src, int dest, List<List<Integer>> result, List<Integer> path, int[][] graph) {
        path.add(src);

        if (src == dest) {
            result.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }

        for (int i = 0; i < graph[src].length; i++) {
            dfs(graph[src][i], dest, result, path, graph);
        }
        path.remove(path.size() -1);
    }
}