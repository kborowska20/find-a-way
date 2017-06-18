package GrafClass;

public class Edge  {
    private final String citys;
    private final Vertex source;
    private final Vertex destination;
    private final int weight;

    public Edge(String citys, Vertex source, Vertex destination, int weight) {
        this.citys = citys;
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public String getCity() {
        return citys;
    }

    public Vertex getDestination() {
        return destination;
    }

    public Vertex getSource() {
        return source;
    }
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return source + " " + destination;
    }

}