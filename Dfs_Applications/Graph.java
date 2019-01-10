import java.util.*;

class Graph {
    int v;
    LinkedList<Integer> a[];

    Graph(int v) {
        this.v = v;
        a = new LinkedList[this.v];
        for (int i = 0; i < v; i++) {
            a[i] = new LinkedList<>();
        }
    }

    void adde(int src, int dest) {
        a[src].add(dest);
        if (src != dest)
            a[dest].add(src);
    }

    void dfs(int y, boolean visited[]) {
        visited[y] = true;
        for (int i : a[y]) {
            if (visited[i] == false) {
                dfs(i, visited);
            }
        }
    }

}