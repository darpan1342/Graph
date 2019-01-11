
class Topological_sort {
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addD(5, 2);
        g.addD(5, 0);
        g.addD(4, 0);
        g.addD(4, 1);
        g.addD(2, 3);
        g.addD(3, 1);
        g.topo();
    }
}