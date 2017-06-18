import GrafClass.Edge;
import GrafClass.Graph;
import GrafClass.Vertex;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();

        Vertex vertex = new Vertex("Warsaw");
        Vertex vertex1 = new Vertex("London");
        Vertex vertex2 = new Vertex("Athens");
        Vertex vertex3 = new Vertex("Lisboa");
        Vertex vertex4 = new Vertex("Paris");

        graph.addVertex(vertex, true);
        graph.addVertex(vertex1, true);
        graph.addVertex(vertex2, true);
        graph.addVertex(vertex3, true);
        graph.addVertex(vertex4, true);


    }
}
