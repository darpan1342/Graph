import java.util.*;

class graph {
    int v;
    LinkedList<Integer> a[];

    graph(int v) {
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

    int dfs(int y, boolean visited[]) {
        visited[y] = true;
        for (int i : a[y]) {
            if (visited[i] == true) {
                return 1;
            }
            if (visited[i] == false) {
                dfs(i, visited);
            }
        }
        return 0;
    }

    int cycle() {
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {

                if (1 == dfs(i, visited)) {
                    return 1;
                }
            }
        }
        return 0;
    }
}

class Cycle {
    public static void main(String[] arg) {
        graph g = new graph(4);
        g.adde(0, 1);
        g.adde(0, 2);
        g.adde(1, 2);
        g.adde(2, 0);
        g.adde(2, 3);
        g.adde(3, 3);
        System.out.println("0 if no cycle and 1 if cycle is present " + g.cycle());
    }
}