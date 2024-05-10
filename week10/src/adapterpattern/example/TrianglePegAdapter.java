package adapterpattern.examples;

public class TrianglePegAdapter extends RoundPeg {
    private TrianglePeg peg;

    public TrianglePegAdapter(TrianglePeg peg) {
        super();
        this.peg = peg;
    }

    public int getRadius() {
        return (int) ((peg.getAc() * peg.getBc() * peg.getAb()) / (4 * peg.getArea()));
    }
}
