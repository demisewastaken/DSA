class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> list) {
        boolean[] visited = new boolean[list.size()];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(0);
        visited[0] = true;
        while (!queue.isEmpty()) {
            int src = queue.poll();
            for (int i = 0; i < list.get(src).size(); i++) {
                if (!visited[list.get(src).get(i)]) {
                    visited[list.get(src).get(i)] = true;
                    queue.offer(list.get(src).get(i));
                }
            }
        }
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) return false;
        }
        return true;
    }
}