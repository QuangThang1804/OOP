package hus.oop.lap10.adapter;

public class AdapterTestDrive {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(6);
        System.out.println(hole.fits(roundPeg));

        SquarePeg squarePeg = new SquarePeg(4);
        SquarePegAdapter adapter = new SquarePegAdapter(squarePeg);
        System.out.println(hole.fits(adapter));
    }
}
