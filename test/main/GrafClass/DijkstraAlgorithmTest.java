package GrafClass;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by KBorowska on 19.06.2017.
 */
class DijkstraAlgorithmTest {

    @Test
    public void testIfisPathTheShortest(){
        List<Vertex> vertices = new ArrayList<>();
        List<Edge> edges = new ArrayList<>();

        Vertex vertex = new Vertex("Warsaw","Warsaw");
        Vertex vertex1 = new Vertex("London","London");
        Vertex vertex2 = new Vertex("Athens","Athens");
        Vertex vertex3 = new Vertex("Lisboa","Lisboa");
        Vertex vertex4 = new Vertex("Paris","Paris");

        Edge edge = new Edge("Warsaw - London",vertex,vertex1, 450);
        Edge edge1 = new Edge("Warsaw - Paris",vertex,vertex4, 100);
        Edge edge2 = new Edge("London - Lisboa",vertex1,vertex3, 250);
        Edge edge3 = new Edge("London - Athens",vertex1,vertex2, 500);
        Edge edge4 = new Edge("Athens - Lisboa",vertex2,vertex3, 800);
        Edge edge5 = new Edge("Lisboa - Paris",vertex3,vertex4, 300);

        vertices.add(vertex);
        vertices.add(vertex1);
        vertices.add(vertex2);
        vertices.add(vertex3);
        vertices.add(vertex4);

        edges.add(edge);
        edges.add(edge1);
        edges.add(edge2);
        edges.add(edge3);
        edges.add(edge4);
        edges.add(edge5);

        Graph graph = new Graph(vertices,edges);
        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm(graph);
        dijkstraAlgorithm.execute(vertices.get(0));
        LinkedList<Vertex> path = dijkstraAlgorithm.getPath(vertices.get(2));
        LinkedList<Vertex> expectedPath = new LinkedList<>();
        expectedPath.add(vertex);
        expectedPath.add(vertex1);
        expectedPath.add(vertex2);
        assertEquals(expectedPath,path);
    }

}