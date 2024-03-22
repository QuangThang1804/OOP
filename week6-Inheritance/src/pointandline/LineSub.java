package pointandline;

public class LineSub extends Point{
    private Point end;

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        end = new Point(endX, endY);
    }

    @Override
    public String toString() {
        return "LineSub[" +
                "begin=" + super.toString() +
                "end=" + end +
                ']';
    }

    public Point getBegin() {
        return this;
    }

    public void setBegin(Point begin) {
        super.setXY(begin.getX(), begin.getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        super.setX(x);
    }

    public void setBeginY(int y) {
        super.setY(y);
    }

    public void setBeginXY(int x, int y) {
        super.setXY(x, y);
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    public void setEndXY(int x, int y) {
        this.end.setXY(x, y);
    }

    public int getLength() {
        return (int) Math.sqrt((Math.pow(super.getX() - end.getX(), 2)
                + Math.pow(super.getY() - end.getY(), 2)));
    }

    public double getGradient() {
        return Math.atan2(Math.abs(super.getY() - end.getY()),
                Math.abs(super.getX() - end.getX()));
    }

    /*
    * Question: Line uses composition and LineSub uses inheritance. Which design is better?
    * Answer: I think composition is better. Because it's more natural than inheritance
    * */
}
