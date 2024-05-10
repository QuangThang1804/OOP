package adapterpattern.examples;

public class TrianglePeg {
    private int ab;
    private int ac;
    private int bc;

    public TrianglePeg(int ab, int ac, int bc) {
        this.ab = ab;
        this.ac = ac;
        this.bc = bc;
    }

    public int getAb() {
        return ab;
    }

    public int getAc() {
        return ac;
    }

    public int getBc() {
        return bc;
    }

    public int getCircumference() {
        return this.getAb() + this.getAc() + this.getBc();
    }

    public int getArea() {
        int p = getCircumference() / 2;
        return (int) Math.sqrt(p * (p - getAb())
                * (p - getBc())
                * (p - getAc()));
    }
}
