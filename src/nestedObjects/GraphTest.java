package nestedObjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GraphTest {
    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Edge edge1 = new Edge(99, one, two);
        Edge edge2 = new Edge(50, one, three);
        Edge edge3 = new Edge(49, four, one);
        System.out.println(edge1.toString());
        System.out.println(edge2.toString());
        System.out.println(edge3.toString());

    }
}

class Edge{
    int weight;
    Node from;
    Node to;

    public Edge(int weight, Node from, Node to){
        this.weight = weight;
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "weight=" + weight +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}

class Node{
    int value;
    int out;
    int in;
    ArrayList<Node> nexts;
    ArrayList<Edge> edges;

    public Node(int value){
        this.value = value;
        in = 0;
        out = 0;
        nexts = new ArrayList<>();
        edges = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", out=" + out +
                ", in=" + in +
                ", nexts=" + nexts +
                ", edges=" + edges +
                '}';
    }
}

class Graph{
    HashMap<Integer, Node> nodes;
    HashSet<Edge> edges;

    public Graph(){
        nodes = new HashMap<>();
        edges = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Graph{" +
                "nodes=" + nodes +
                ", edges=" + edges +
                '}';
    }
}