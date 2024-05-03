package adapterpattern.examples;

public class Client {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println(roundHole.fits(roundPeg));

        TrianglePeg smallTrianglePeg = new TrianglePeg(5, 5, 5);
        TrianglePeg largeTrianglePeg = new TrianglePeg(30, 30, 50);
//        System.out.println(roundHole.fits(smallSquarePeg));
        TrianglePegAdapter smallTrianglePegAdapter = new TrianglePegAdapter(smallTrianglePeg);
        TrianglePegAdapter largeTrianglePegAdapter = new TrianglePegAdapter(largeTrianglePeg);
        System.out.println(roundHole.fits(smallTrianglePegAdapter));
        System.out.println(roundHole.fits(largeTrianglePegAdapter));
    }
}
