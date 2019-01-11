import java.util.*;

class Graph {
    int v;
    LinkedList<Integer> a[];
    int count;

    Graph(int v) {
        this.v = v;
        a = new LinkedList[this.v];
        for (int i = 0; i < v; i++) {
            a[i] = new LinkedList<>();
        }
        count = 0;
    }

    void adde(int src, int dest) {
        a[src].add(dest);
        if (src != dest)
            a[dest].add(src);
    }

    void addD(int src, int dest) {
        a[src].add(dest);
    }

    void dfs(int y, boolean visited[]) {
        visited[y] = true;
        for (int i : a[y]) {
            if (visited[i] == false) {
                dfs(i, visited);
            }
        }
    }

    void dfs(int y, boolean visited[], Stack<Integer> s) {
        visited[y] = true;
        for (int j : a[y]) {
            if (visited[j] == false) {

                dfs(j, visited, s);
            }
        }
        s.push(y);
    }

    void topo() {
        boolean[] visited = new boolean[v];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < v; i++) {
            if (visited[i] == false)
                dfs(i, visited, s);
        }
        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }

}
