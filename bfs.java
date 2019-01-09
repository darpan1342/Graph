import java.util.*;

class graph {
    LinkedList<Integer> a[];
    int v;

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

    void dfsutil(int vertex, boolean[] visite) {
        visite[vertex] = true;
        System.out.println(vertex);
        for (int i : a[vertex]) {
            if (visite[i] == false) {
                dfsutil(i, visite);
            }
        }
    }

    void dfs() {
        boolean visite[];
        visite = new boolean[v];
        dfsutil(2, visite);
    }

    void bfs(int y) {
        boolean visite[];
        visite = new boolean[v];
        ArrayList<Integer> q = new ArrayList<>(v);
        visite[y] = true;
        q.add(y);
        while (!q.isEmpty()) {
            int s = q.get(0);
            System.out.println(s);
            q.remove(0);
            for (int i : a[s]) {
                if (visite[i] == false) {
                    visite[i] = true;
                    q.add(i);
                }
            }
        }
    }
}

class bfs {
    public static void main(String[] args) {
        graph g = new graph(4);
        g.adde(0, 1);
        g.adde(0, 2);
        g.adde(3, 2);
        g.adde(2, 0);
        g.adde(2, 1);
        g.adde(3, 3);
        g.dfs();
        g.bfs(2);
    }
}