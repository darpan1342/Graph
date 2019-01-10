
class connect {

    int connectcheck(Graph g, int v) {
        boolean[] visited = new boolean[v];
        g.dfs(0, visited);
        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                return 0;
            }
        }
        return 1;
    }
}

class connected {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.adde(0, 1);
        g.adde(0, 2);
        g.adde(1, 2);
        g.adde(2, 0);
        g.adde(2, 3);
        g.adde(3, 3);
        connect c = new connect();
        System.out.println("Not Connected 0 and Connected 1 " + c.connectcheck(g, 5));
    }
}